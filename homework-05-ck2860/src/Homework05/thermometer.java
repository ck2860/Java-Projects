/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 * The goal of the assignment#05 is to use encapsulation.
 */
package Homework05;
/*
 *Answering the question #3 of Homework #05
 */
public class thermometer {
    /**
     * celsius would be the field for this class.
     */
    private double celsius;
    /**
     * This is a default/parameterless constructor that initializes the temperature of celsius to
     * the average human body temperature.
     */
    public thermometer() {
        this.celsius = 37;
    }
    /**
     * The accessor was used to get the temperature of celsius.
     * @return would return celsius
     */
    public double getCelsius() {
        return celsius;
    }
    /**
     * The mutator used to set the temperature of celsius.
     */
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
    /**
     * The accessor was used to get the temperature of Fahrenheit, by converting from celsius.
     * @return would return Fahrenheit
     */
    public double getFahrenheit() {
        return (celsius * 1.8) + 32;
    }
    /**
     * The accessor was used to get the temperature of Kelvin, by converting from celsius.
     * @return would return in Kelvin
     */
    public double getKelvin() {
        return celsius + 273.15;
    }
    /**
     *toString method was used to print each field in the formatted string.
     * @return formatted string of thermometer class' three temperatures: celsius, fahrenheit, and kelvin
     */
    @Override
    public String toString() {
        return "thermometer [" + getCelsius() + " Celsius = " + getFahrenheit() + " Fahrenheit = " + getKelvin() + " Kelvin]";
    }
}
