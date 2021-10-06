/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 * The goal of the assignment#05 is to use encapsulation.
 */
package Homework05;
/*
 *Answering the question #1 of Homework #05
 */
public class testingClasses {
    /**
     *The physicalElement class was executed to create and print 10 unique elements.
     * All of the information are found via ptable.com
     *
     *The thermometer class was used to create and print the temperatures in all three scales.
     * All of the formula are found via https://contractorquotes.us/temperature-conversion-table/
     *
     *The rateMyProfessor class was used to create and print initial state of each professor.
     * Also, prints each time when the states of the professor changes, etc..
     *
     * @param args is a part of main method, for command arguments.
     */
    public static void main(String[] args) {
        // this is for problem 02, creating and printing 10 unique elements.
        physicalElements hydrogen = new physicalElements("Hydrogen", "H", 1, 1.008f);
        physicalElements helium = new physicalElements("Helium", "He", 2, 4.0026f);
        physicalElements lithium = new physicalElements("Lithium", "Li", 3, 6.94f);
        physicalElements carbon = new physicalElements("Carbon", "C", 6, 12.011f);
        physicalElements nitrogen = new physicalElements("Nitrogen", "N", 7, 14.007f);
        physicalElements oxygen = new physicalElements("Oxygen", "O", 8, 15.9999f);
        physicalElements fluorine = new physicalElements("Fluorine", "F", 9, 18.998f);
        physicalElements aluminum = new physicalElements("Aluminum", "Al", 13, 26.982f);
        physicalElements sodium = new physicalElements("Sodium", "Na", 11, 22.990f);
        physicalElements calcium = new physicalElements("Calcium", "Ca", 20, 40.078f);
        System.out.println(hydrogen);
        System.out.println(helium);
        System.out.println(lithium);
        System.out.println(carbon);
        System.out.println(nitrogen);
        System.out.println(oxygen);
        System.out.println(fluorine);
        System.out.println(aluminum);
        System.out.println(sodium);
        System.out.println(calcium);
        System.out.println("----------------------------------------------------------------");
        //This is for problem03, creating a thermometer and printing all three temperatures.
        thermometer temperature = new thermometer();
        System.out.println(temperature);
        temperature.setCelsius(100);
        System.out.println(temperature);
        temperature.setCelsius(-200);
        System.out.println(temperature);
        temperature.setCelsius(59);
        System.out.println(temperature);
        temperature.setCelsius(-30);
        System.out.println(temperature);
        temperature.setCelsius(-11);
        System.out.println(temperature);
        temperature.setCelsius(88);
        System.out.println(temperature);
        System.out.println("----------------------------------------------------------------");
        //This is for problem04, creating rating for professors.
        rateMyProfessors dataScienceProfessor01 = new rateMyProfessors("Travis", "Desell", "Rochester Institute of Technology", "Data Science 101",4, 3);
        rateMyProfessors softwareEngineeringProfessor = new rateMyProfessors("Robert", "St.Jacques", "Rochester Institute of Technology", "Software Construction",4, 3);
        rateMyProfessors statisticsProfessor = new rateMyProfessors("Robert", "Parody", "Rochester Institute of Technology", "Statistics",5, 3);
        rateMyProfessors microbiologyProfessor = new rateMyProfessors("Karen", "Ottemann", "University of California, Santa Cruz", "Statistics",5, 2);
        rateMyProfessors dataScienceProfessor02 = new rateMyProfessors("Vijayalakshmi", "Saravanan", "Rochester Institute of Technology", "Data Mining",2, 5);
        System.out.println(softwareEngineeringProfessor);
        softwareEngineeringProfessor.rating(5,2);
        System.out.println(softwareEngineeringProfessor);
        softwareEngineeringProfessor.rating(4,4);
        System.out.println(softwareEngineeringProfessor);

        System.out.println(statisticsProfessor);
        statisticsProfessor.setLastName("Peanut");
        statisticsProfessor.rating(2,2);
        System.out.println(statisticsProfessor);
        statisticsProfessor.rating(4,3);
        System.out.println(statisticsProfessor);

        System.out.println(dataScienceProfessor01);
        dataScienceProfessor01.setSubject("Data Science 102");
        dataScienceProfessor01.setUniversityName("University of California, Santa Cruz");
        System.out.println(dataScienceProfessor01);

        System.out.println(microbiologyProfessor);
        microbiologyProfessor.setSubject("General Biology");
        System.out.println(microbiologyProfessor);

        System.out.println(dataScienceProfessor02);
        dataScienceProfessor02.setLastName("Lewis");
        dataScienceProfessor02.rating(1, 5);
        System.out.println(dataScienceProfessor02);



    }
}
