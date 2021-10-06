/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package Homework07;
/*
 *Answering the question #5 of Homework #07
 */
import java.util.Random;
/*
 * importing java.util.Random class for generating two randomized types of Pokemon
 */
import java.util.Scanner;
/*
 * importing java.util.Scanner class for standard input
 */
public class Testing {
    /**
     *
     * The two pseudorandom numbers would be generated between 0 and 3 in order to generate two new Pokemon of random types.
     * First randomized number would be determined to choose one of those pokemonTypes: GRASS, WATER, FIRE, or NORMAL for the first player.
     * Second randomized number would be assigned to choose one of those pokemonTypes: GRASS, WATER, FIRE, or NORMAL for the second player.
     * two randomized numbers are used for the players' attacks between 50-100.
     * two randomized numbers are used for the players' healths between 500-1000.
     *
     * Arena was created for a game that two Pokemons can play.
     * Once the battle function is called, the beingAttacked (from Pokemon class) method is called. The players attack each other until whoever wins.
     * After the battle ends, the prompt prints and asks the user if she/he wants to watch another battle or not.
     * If this user wants to watch another battle, the while loop would be continued until the user enters 2 to exit the loop.
     *
     * @param args is a part of main method, for command arguments.
     */

    public static void main(String[] args) {
        Random ran = new Random();
        int counter = 0;
        while (counter < 1) {
            int randType1 = ran.nextInt(4);
            int randType2 = ran.nextInt(4);
            int randAttack1 = ran.nextInt(50)+51; //attack (50-100)
            int randAttack2 = ran.nextInt(50)+51; //attack (50-100)
            int randHealth1 = ran.nextInt(500)+501; //health(500-1000).
            int randHealth2 = ran.nextInt(500)+501; //health(500-1000).

            Pokemon firstPlayer;
            switch (randType1) {
                case 0:
                    firstPlayer = new GRASS("Bulbasaur", randAttack1, randHealth1);
                    break;
                case 1:
                    firstPlayer = new FIRE("Charmander", randAttack1, randHealth1);
                    break;
                case 2:
                    firstPlayer = new WATER("Squirtle", randAttack1, randHealth1);
                    break;
                case 3:
                default:
                    firstPlayer = new Pokemon("Rattata", pokemonType.NORMAL, randAttack1, randHealth1);
                    break;
            }
            System.out.println("First " + firstPlayer.toString());

            Pokemon secondPlayer;
            switch (randType2) {
                case 0:
                    secondPlayer = new GRASS("Ivysaur", randAttack2, randHealth2);
                    break;
                case 1:
                    secondPlayer = new FIRE("Charmeleon", randAttack2, randHealth2);
                    break;
                case 2:
                    secondPlayer = new WATER("Wartortle", randAttack2, randHealth2);
                    break;
                case 3:
                default:
                    secondPlayer = new Pokemon("Meowth", pokemonType.NORMAL, randAttack2, randHealth2);
                    break;
            }
            System.out.println("Second " + secondPlayer.toString());

            Arena game1 = new Arena(firstPlayer, secondPlayer);
            game1.battle(firstPlayer, secondPlayer);
            System.out.println("Do you want to watch another battle? Enter 1 for yes or Enter 2 for no.");
            Scanner scanner = new Scanner(System.in);
            int user = scanner.nextInt();
            if (user == 1) {
                System.out.println("Enjoy watching the next battle.");
                counter = 0;
            } else {
                System.out.println("Have a great day!");
                counter++;
            }
        }
    }
}