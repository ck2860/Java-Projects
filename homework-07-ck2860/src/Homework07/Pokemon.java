/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package Homework07;
/*
 *Answering the question #2 of Homework #07
 */
public class Pokemon {
    /**
     *  Pokemon class has a String name, pokemonType type, int attack, and int health as private fields.
     */
    private String name;
    private pokemonType type;
    private int attack;
    private int health;

    /**
     * The constructor sets for the name, attack, and health only. The "this" keyword was used to insure that we refer
     * to the field with the names. The field of this.type is set to default as normal. The parameters for name, attack and health are defined as this.name,
     * this.attack, and this.health.
     *
     * @param name would be assigned to this.name.
     * @param attack would be assigned to this.attack.
     * @param health would be assigned to this.health.
     */
    public Pokemon(String name, int attack, int health){
        this.name = name;
        this.type = pokemonType.NORMAL;
        this.attack = attack;
        this.health = health;
    }
    /**
     * The initializing constructor that take the parameters for all of the fields. The "this" keyword was used to insure that we refer
     * to the field with the names. The parameter for name, type, attack, and health are set for this.name, this.type, this attack, and this.health.
     *  This is for when you want the different type of Pokemon.
     *
     * @param name
     * @param type
     * @param attack
     * @param health
     */
    public Pokemon(String name, pokemonType type, int attack, int health){
        this.name = name;
        this.type = type;
        this.attack = attack;
        this.health = health;
    }
    /**
     * The mutator for String name.
     * @param name sets for this.name.
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * The mutator for pokemonType.
     * @param type sets for this.type.
     */
    public void setType(pokemonType type){
        this.type = type;
    }
    /**
     * The mutator for int attack.
     * @param attack sets for this.attack.
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }
    /**
     * The mutator for int health.
     * @param health sets for this.health.
     */
    public void setHealth(int health){
        this.health = health;
    }
    /**
     * An accessor for String name.
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * An accessor for pokemonType type: NORMAL, WATER, GRASS, and FIRE.
     * @return pokemon type
     */
    public pokemonType getType() {
        return type;
    }
    /**
     * An accessor for int attack.
     * @return the amount of attack
     */
    public int getAttack() {
        return attack;
    }
    /**
     * An accessor for int health.
     * @return the amount of health
     */
    public int getHealth() {
        return health;
    }
    /**
     * The beingAttacked method is when the Pokemon(first player) is attacked by the other Pokemon ("enemy").
     * This method would take a pokemon as a parameter to deduct it's attack from this first Pokemon.
     * The if-else series is performed; one of the statement would be executed as followed by the type of Pokemon.
     * If the enemy is the pokemonType.FIRE, the pokemon's health would be deducted by the enemy's attack.
     * This applies to all types of pokemon enemy for this NORMAL pokemon.
     * So if the first pokemon's health reduces below 0, it's health would be set to zero so it would never be zero.
     * Lastly, it would return the amount of damage done by the enemy.
     * @param enemy is the one attacking the other Pokemon.
     * @return the amount of damage done
     */
    public int beingAttacked(Pokemon enemy) {
        if (enemy.getType() == pokemonType.FIRE) {
            this.health -= enemy.getAttack();
//            this.health = this.health - enemy.attack;
        } else if (enemy.getType() == pokemonType.WATER) {
            this.health -= enemy.getAttack();
        } else if (enemy.getType() == pokemonType.GRASS) {
            this.health -= enemy.getAttack();
        } else { //normal
            this.health -= enemy.getAttack();
        }
        if (this.health <= 0){
            this.health = 0;
        }
        return enemy.getAttack();
    }
    /**
     * The healthStatus method is used when a Pokemon loses consciousness as its health reduces to zero, and return false.
     * On the other hand, if the pokemon is still conscious, it remains as true.
     *
     * @return a boolean value as if the pokemon is still conscious, return true. Otherwise, false.
     */
    public boolean healthStatus(){
        if (this.getHealth() > 0) {
            return true;
        }
        return false;
    }
    /**
     *toString method was used to print Pokemon name, Pokemon type, Pokemon Attack, and Pokemon Health.
     * @return formatted string of Pokemon's getters: getName(), getType(), getAttack(), and getHealth().
     */
    @Override
    public String toString () {
        return "Pokemon [Pokemon name = " +  getName() + ", Pokemon type = " + getType() + ", Pokemon Attack = " + getAttack() + ", Pokemon Health = " + getHealth() + " ]";
    }
}
