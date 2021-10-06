/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 * The goal of the assignment#05 is to use encapsulation.
 */
package Homework05;
/*
 *Answering the question #2 of Homework #05
 */
public class physicalElements {
    /**
     *  physicalElement class have a String name, a String symbol, an integer atomic number, and an atomic weight
     *  as private fields.
     */
    private String name;
    private String symbol;
    private int atomicNumber;
    private float atomicWeight;

    /**
     * The initializing constructor sets all of the fields. The "this" keyword was used to insure that we refer
     * to the field with the names. All of the parameters are set for this.name, this.symbol, this.atomicNumber, and this.atomicWeight respectively.
     * @param name would be assigned to this.name
     * @param symbol would be assigned to this.symbol
     * @param atomicNumber would be assigned to this.atomicNumber
     * @param atomicWeight would be assigned to this.atomicWeight.
     */
    public physicalElements(String name, String symbol, int atomicNumber, float atomicWeight){
        this.name=name;
        this.symbol=symbol;
        this.atomicNumber=atomicNumber;
        this.atomicWeight=atomicWeight;
    }
    /**
     * The accessor was used to get the String of name
     * @return name
     */
    public String getName (){
        return name;
    }
    /**
     * The accessor was used to get the symbol
     * @return symbol
     */
    public String getSymbol (){
        return symbol;
    }
    /**
     * The accessor is used to get the atomic number
     * @return atomicNumber
     */
    public int getAtomicNumber (){
        return atomicNumber;
    }
    /**
     * The accessor is used to get the atomic weight
     * @return
     */
    public float getAtomicWeight(){
        return atomicWeight;
    }
    /**
     *toString method was used to print each field in the formatted string.
     * @return formatted string of physicalElements class' fields: name, symbol, atomicNumber, and atomicWeight
     */
    @Override
    public String toString () {
        return "physicalElements [name = " + getName() +", symbol = " + getSymbol() +
                ", atomic number = " + getAtomicNumber() + ", atomic weight = " + getAtomicWeight() + "]";
    }
}
