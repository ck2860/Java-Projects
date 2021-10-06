/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package Homework07;
/*
 *Answering the question #4 of Homework #07
 */
public class Arena {
    /**
     * Arena class has a Pokemon player 1 and Pokemon player 2 as private fields.
     */
    private Pokemon player1;
    private Pokemon player2;

    /**
     * The constructor sets for the Pokemon player1 and Pokemon player2. This "this" keyword was used to insure that we
     * refer to the fields with the names. The field of this.player1 is set to player1 and
     * the field of this.player2 is set to player2.
     *
     * @param player1 would be assigned to this.player1
     * @param player2 would be assigned to this.player2.
     */
    public Arena(Pokemon player1, Pokemon player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    /**
     * The mutator for Pokemon player1.
     *
     * @param player1 assigns to be player1.
     */
    public void setPlayer1(Pokemon player1) {
        this.player1 = player1;
    }

    /**
     * The mutator for Pokemon player2.
     *
     * @param player2 assigns to be player2.
     */
    public void setPlayer2(Pokemon player2) {
        this.player2 = player2;
    }

    /**
     * An accessor for Pokemon player1.
     *
     * @return Pokemon player1.
     */
    public Pokemon getPlayer1() {
        return player1;
    }

    /**
     * An accessor for Pokemon player2.
     *
     * @return Pokemon player2.
     */
    public Pokemon getPlayer2() {
        return player2;
    }

    /**
     * The battle method was created to allow two Pokemon playing/battling against each other.
     * This function takes two parameters that only accept two Pokemon players.
     * The while loop was used to allow the players 'attacking' against each other back and forth until one or both players get knocked out.
     * The if-else statements were performed each time they attack against each other, the else statement kept executing until one or both's healthStatus (the method from Pokemon class) become false
     * After one of those If statements executed, the while's condition becomes false and stops the loop. It would exit out and prints "The battle is over".
     *
     * @param one takes a Pokemon player1
     * @param two takes a Pokemon player2
     */

    public void battle(Pokemon one, Pokemon two) {
        int i = 0;
        System.out.println(one.getName()+ " wants to battle!");
        while (one.getHealth() > 0 && two.getHealth() > 0) {
            i++;
            System.out.println("------Round " + i + "------");
            two.beingAttacked(one);
            System.out.println(one.getName() + " attacks " + two.getName());
            System.out.println(two.getName() + " suffered " + one.getAttack() +" damage points from " + one.getName());
            System.out.println(two.getName() + "'s remaining health is " + two.getHealth());
            one.beingAttacked(two);
            System.out.println(two.getName() + " attacks " + one.getName());
            System.out.println(one.getName() + " suffered " + two.getAttack() +" damage points from " + two.getName());
            System.out.println(one.getName() + "'s remaining health is " + one.getHealth());
            if (one.healthStatus() == false && two.healthStatus() == false) {
                System.out.println("Both players are knocked out!!");
            } else if (one.healthStatus() == false) {
                System.out.println(one.getName() + " is knocked out!");
            } else if (two.healthStatus() == false) {
                System.out.println(two.getName() + " is knocked out!");
            }
        }
        System.out.println("The battle is over");
    }
}
