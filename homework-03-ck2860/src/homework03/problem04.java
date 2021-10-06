/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 * The goal of the assignment#03 is to use boolean expressions, a series of if-else-if statements, and switch statements
 * and develop java programming skills.
 */

package homework03;
/*
 * importing java.util.Scanner class for standard input
 */
import java.util.Scanner;
/*
*Answering the question #4 of Homework #03
 */
public class problem04 {

    /**
     * This monthDate function is used to convert the numbers of the month in a string form to month names and return the month name.
     * If the user enters invalid numbers for the month the return would print "not a month". There are 12 months.
     * A switch statement is performed as the conditional statement in this function. The value of M is the expression
     * If the input is valid, the value of M would be compared to each case and matched one of the cases.
     * When it finds the match, the statement will be performed.
     * It is used to choose the correct month names: 1 as January, 2 as February, 3 as March, 4 as April, 5 as May,
     * 6 as June, 7 as July, 8 as August, 9 as September, 10 as October, 11 as November, 12 as December.
     * @param M the String in numbers of the month that the user enters, along with rest of the date.
     * @return the converted Month name as the user's choice.
    */

    public static String monthDate(String M) {
        String month = "not a month";
        switch (M) {
            case "01":
                month = "January";
                break;
            case "02":
                month = "February";
                break;
            case "03":
                month = "March";
                break;
            case "04":
                month = "April";
                break;
            case "05":
                month = "May";
                break;
            case "06":
                month = "June";
                break;
            case "07":
                month = "July";
                break;
            case "08":
                month = "August";
                break;
            case "09":
                month = "September";
                break;
            case "10":
                month = "October";
                break;
            case "11":
                month = "November";
                break;
            case "12":
                month = "December";
                break;
            }
        return month;
    }

    /**
     * This dayDate function is used to obtain and add the correct suffix ("st", "nd", "rd", or"th") for a specific day.
     * It returns a number with a appropriate suffix as a string.
     * The input would be entered as a chosen day but between 1 and 31.
     * The switch statement as a conditional statement would be executed.
     * The modulo of the day and 10 is the expression of the switch. The remainder after the division would be either 1, 2, or 3.
     * The value of the expression would be compared to each case until it is matched.
     * Once the expression and the case match, the String suffix would be assigned.
     * When the result of expression is 1 and the chosen day is not 11, the suffix would be assigned as "st". If the chosen day is 11 then the suffix would be "th".
     * If the remainder of the modulo is 2 and the chosen day is not 12, then the suffix would be "nd". However, if the chosen day is 12, then it is "th".
     * In the last case, the result of expression has to be 3. If the chosen day is not 13, then it is "rd". Otherwise, the suffix would be "th".
     * For rest of the numbers in days, the suffix would be always defaulted as "th".
     * if the user enters a day that does not exist (greater than 31), it would return "not a day".
     * @param D the integer in a specific day that the user enters, along with rest of the date.
     * @return a concatenated string of a specific day (as D parameter) and its correct suffix.
     */

    public static String dayDate(int D) {
        String suffix;
        if (D < 32) {
            switch (D % 10) {
                case 1:
                    if (D != 11) {
                        suffix = D+"st";
                    } else {
                        suffix = D+"th";
                    }
                    break;
                case 2:
                    if (D != 12) {
                        suffix = D+"nd";
                    } else {
                        suffix = D+"th";
                    }
                    break;
                case 3:
                    if (D != 13) {
                        suffix = D+"rd";
                    } else {
                        suffix = D+"th";
                    }
                    break;
                default:
                    suffix = D+"th";
                    break;
            }
        }else{
            suffix = "not a day";
        }
        return suffix;
    }

    /**
     * This convert1 function would change the date format from "YYYY/MM/DD" to "Month Day, Year".
     * new String (); and .substring(int beginIndex, int endIndex);command were found on Oracle's java.lang.String class documentation (https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/lang/String.html)
     * new String (); is used to assign a new String variable.
     * When an user enters a date in a format of YYYY/MM/DD, the input would be assigned to the new String variable.
     *.substring (int beginIndex, int endIndex); is used to divide/return a desired piece from the String variable. It applies for year, month, and day.
     * with .substring command, the dashes would be skipped in the date format.
     * For year, the beginning index and ending index are 0 and 4 respectively.
     * For month, the beginning index and ending index are 5 and 7 respectively.
     * Lastly for day, the beginning index and ending index are 8 and 10 respectively.
     * .valueOf(); command was also found on Oracle's java.lang.String class documentation.
     * Integer.valueof() was used to converting day into an integer form in order to execute the dayDate function.
     * the monthDate function was used to obtain the appropriate month name.
     * The finalized concatenated string of month, day, and year would be printed.
     * @param wholeDate an user enters a date in the format, "YYYY/MM/DD" as a string.
     * @return a string in the format, "Month Day, Year".
     */

    public static String convert1(String wholeDate) {
        String YYYYMMDD = new String(wholeDate);
        String Y = YYYYMMDD.substring(0,4);
        String M = YYYYMMDD.substring(5,7);
        String D = YYYYMMDD.substring(8,10);
        int d = Integer.valueOf(D);
        return monthDate(M)+ " " + dayDate(d) + ", " + Y;
    }

    /**
     *The program for standard input is in the main method.
     * System.out is used for a prompt.
     * The Scanner method was used to read/obtain the user's input.
     * Once the user types her/his the date in the format of YYYY/MM/DD, the convert1 function would be executed.
     *
     * @param args is a part of the main method, for command arguments.
     */

    public static void main(String[] args) {
        System.out.print("Enter a date in the format of YYYY/MM/DD: ");
        Scanner scanner2 = new Scanner(System.in);
        String h = scanner2.next();
        System.out.println(convert1(h));
    }
}
// end of problem04 Java Class