/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package Homework07;
/*
 *Answering the question #3 of Homework #07
 */

public class GRASS extends Pokemon{
    /**
     * The constructor that sets the name, pokemonType, attack, and health fields. It takes name, attack and health as parameters.
     * Since this subclass is always for pokemonType.GRASS. Instead of creating its own states, the keyword, "super" can be used in the constructor in order to
     * be inherited from the parent class. The parameter for String name is set for its name. The parameter for int attack is set for its attack.
     * The parameter for int health is also set for its health.
     * @param name assigns to the pokemonType.GRASS's name
     * @param attack assigns to the pokemonType.GRASS's attack
     * @param health assigns to the pokemonType.GRASS's attack
     */
    public GRASS(String name,  int attack, int health){
        super(name, pokemonType.GRASS, attack ,health);
    }
    /**
     * The beingAttacked method is overridden through polymorphism.
     * This beingAttacked method is when the Pokemon(first player) is attacked by the other Pokemon ("enemy").
     * This method would take a pokemon as a parameter to deduct it's attack from this first Pokemon.
     * The if-else series is performed; one of the statement would be executed as followed by the type of Pokemon.
     * If the enemy is the pokemonType.FIRE, the pokemon's health would be deducted by twice of  the enemy's attack.
     * If the enemy is the pokemonType.WATER, the pokemon's health would be reduced by 1/2 of the enemy's attack.
     * If the enemy is the pokemonType.GRASS, the pokemon's health would be reduced by the enemy's attack.
     * Otherwise, if the enemy is the pokemonType.NORMAL, then the pokemon's health would be reduced by the enemy's attack.
     * So if the pokemon's health reduces below 0, its health would be set to zero so it would never be zero.
     * Lastly, it would return the amount of damage done by the enemy.
     * @param enemy is the one attacking the other Pokemon.
     * @return the amount of damage done
     */
    @Override
    public int beingAttacked(Pokemon enemy) {
        int originalHealth = this.getHealth();
        if (enemy.getType() == pokemonType.FIRE) {
            setHealth(this.getHealth()-(enemy.getAttack()*2));
        } else if (enemy.getType() == pokemonType.WATER) {
            setHealth(this.getHealth()-(enemy.getAttack()/2));
        } else if (enemy.getType() == pokemonType.GRASS) {
            setHealth(this.getHealth()-enemy.getAttack());
        } else { // NORMAL
            setHealth(this.getHealth()-enemy.getAttack());
        }
        enemy.setAttack(originalHealth - this.getHealth());
        if (getHealth() <= 0){
            setHealth(0);
        }
        return enemy.getAttack();
    }
}