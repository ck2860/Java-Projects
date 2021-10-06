/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package Homework10;
/*
 *Answering the question #4 of Homework #10.
 */
import java.io.ObjectStreamException;
import java.util.Scanner;
/*
 * Using java.util.Scanner class for standard input
 */
public class Calculator {
    /**
     * a private field of Object [] opArray that holds operations.
     */
    private Object[] opArray;

    /**
     * the constructor that creates an array to take all of the operations
     */
    public Calculator() {
        Object[] operationArray = new Object[8];
        operationArray[0] = "+";
        operationArray[1] = "-";
        operationArray[2] = "//";
        operationArray[3] = "**";
        operationArray[4] = "^";
        operationArray[5] = "/";
        operationArray[6] = "*";
        operationArray[7] = "%";
        this.opArray = operationArray;
    }

    /**
     * The calculating method that takes two parameters -- String operator and double [] operand;
     * Once the operator matches the operator in the array, the switch statement is executed in order to perform the operation method.
     * After the switch statement/operation method is performed, the result would be returned.
     *
     * @param operator String operator
     * @param operand  Double [] operand
     * @return result
     */
    public static Object calculating(String operator, double[] operand) {
        Calculator calculator1 = new Calculator();
        AbstractOperation op;
        Object result = "Unknown operator: $:";
        for (int i = 0; i < calculator1.opArray.length; i++) {
            if (calculator1.opArray[i].equals(operator)) {
                switch (operator) {
                    case "+":
                        op = new Sum("+");
                        result = op.operation(operand);
                        break;
                    case "-":
                        op = new Difference("-");
                        result = op.operation(operand);
                        break;
                    case "/":
                        op = new Division("/");
                        // check for divide by 0 and stop
                        for (int a = 1; a < operand.length; a++) {
                            if (operand[a] == 0) {
                                System.out.println("Cannot be divided by 0");
//                                System.exit(-1);
                            }
                        }
                        result = op.operation(operand);
                        break;
                    case "%":
                        op = new Modulo("%");
                        for (int a = 1; a < operand.length; a++) {
                            if (operand[a] == 0) {
                                System.out.println("Cannot be divided by 0");
//                                System.exit(-1);
                            }
                        }
                        result = op.operation(operand);
                        break;
                    case "//":
                        op = new Integer_Division("//");
                        for (int a = 1; a < operand.length; a++) {
                            if (operand[a] == 0) {
                                System.out.println("Cannot be divided by 0");
//                                System.exit(-1);
                            }
                        }
                        result = op.operation(operand);
                        break;
                    case "^":
                        op = new Exponent("^");
                        result = op.operation(operand);
                        break;
                    case "**":
                        op = new Exponent("**");
                        result = op.operation(operand);
                        break;
                    case "*":
                        op = new Multiply("*");
                        result = op.operation(operand);
                        break;
                }
            }
        }
        return result;
    }

    /**
     * The scanner is used to get the user's inputs for operator and operands.
     * The first prompt would asked for an operator
     * if the user enter "quit" then it would end the program
     * Then the second prompt would be asking you to enter an amount of numbers that you want to compute.
     * You would be asked to enter an operand many times as you enter for an amount of the numbers.
     * the operator and an array of operands that you enter would be parameters for calculating.
     * This would be performed by calling the calculating method.
     * It would go through all over again and again until you enter quit.
     * @param args
     */

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to calculator! ");
        int counter = 0;
        int total = 0;
        while (counter < 1){
            System.out.println("Enter an operator: ");
            String operatorA = scanner.next();
            if (operatorA.equals("quit")) {
                counter++;
            }else {
                System.out.println("Enter an amount of numbers that you want to compute: ");
                int number = scanner.nextInt();
                double[] operandsB = new double[number];
                for (int i = 0; i < operandsB.length; i++) {
                    System.out.println("Enter an operand: ");
                    operandsB[i] = scanner.nextDouble();
                }
                Object test1 = calculator.calculating(operatorA, operandsB);
                System.out.println(test1);

            }
        }
    }
}

// end of Calculator Java class.