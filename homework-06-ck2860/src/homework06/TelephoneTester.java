/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package homework06;
/*
 *Answering the question #1 of Homework #06
 */
public class TelephoneTester {
    /**
     * Ten telephones were created to test the Telephone class & telephoneType ernm.
     * The toString were printed to show that the recently dialed phone number were updated.
     * the toString statement applied to every telephone to see if the most recently dialed phone number were updated.
     *
     * Telephone one was firstly created with a landline type and got assigned with a phone number, starting with 555000 + number (in this case, 5550001)
     * Telephone one called the dialing & disconnecting methods 11 times (with different phone numbers) to test the dialed array.
     * Once, telephone one called the dialing method 11th time, it pushes the last 8 phone number to its next place so the 11th call is placed in the place of 0 since it is in reverse.

     * When Telephone two was created, redialing method was tested to see if it was successfully redialed.
     *
     * Telephone three called the dialing method twice to see that the second time printed that the second call isn not made because the first call is already in progress.
     *
     * Telephone four simply called the dialing and disconnecting method.
     *
     * Telephone five only called the dialing method.
     *
     * Telephone six did dialing method, disconnecting, then redialing, disconnecting, then dialing with a different phone number & disconnecting.
     * The reverse array of the dialing numbers were printed.
     *
     * Telephone seven only called redialing to show you that there is no phone number to redial.
     *
     * Telephone eight called the dialing with its own phone number and printed out an error.
     *
     * the total of successful calls in the main method is recorded and printed.
     *
     * Telephone nine and ten were created with the same phone number of Telephone eight but with different telephoneType.
     * Telephone nine's type is landline and Telephone ten's type is satellite. They are created to test that they are deeply equal with the equals methods.
     *
     * @param args is a part of main method, for command arguments.
     */
    public static void main(String[] args) {
        System.out.println("----Telephone #1----");
        Telephone one = new Telephone(telephoneType.landline);
        System.out.println(one);
        int[] redialedArr = one.getDialedArray();
        one.dialing(5550005);
        one.disconnecting();
        one.dialing(5550006);
        one.disconnecting();
        one.dialing(5550007);
        one.disconnecting();
        one.dialing(5550008);
        one.disconnecting();
        one.dialing(5550009);
        one.disconnecting();
        one.dialing(5550010);
        one.disconnecting();
        one.dialing(5550011);
        one.disconnecting();
        one.dialing(2000001);
        one.disconnecting();
        one.dialing(2001001);
        one.disconnecting();
        one.dialing(2002001);
        one.disconnecting();
        one.dialing(2004001);
        one.disconnecting();
        System.out.println("-----Telephone #1 Dial List-----");
        for (int i = redialedArr.length; i > 0; i--) {
            if (redialedArr[i-1] != 0) {
                    System.out.println(redialedArr[i-1]);
            }
        }
        System.out.println(one);
        System.out.println("-----------------end of Telephone #1------------------------------");
        System.out.println("----Telephone #2----");
        Telephone two = new Telephone(telephoneType.landline);
        System.out.println(two);
        two.dialing(2002001);
        two.disconnecting();
        two.redialing();
        System.out.println(two);
        System.out.println("-----------------end of Telephone #2------------------------------");
        System.out.println("----Telephone #3----");
        Telephone three = new Telephone(telephoneType.mobile);
        System.out.println(three);
        three.dialing(2002008);
        three.dialing(2002008);
        System.out.println(three);
        System.out.println("-----------------end of Telephone #3------------------------------");
        System.out.println("----Telephone #4----");
        Telephone four = new Telephone(telephoneType.satellite);
        System.out.println(four);
        four.dialing(2002008);
        four.disconnecting();
        System.out.println(four);
        System.out.println("-----------------end of Telephone #4------------------------------");
        System.out.println("----Telephone #5----");
        Telephone five = new Telephone(telephoneType.mobile);
        System.out.println(five);
        five.dialing(1256789);
        System.out.println(five);
        System.out.println("-----------------end of Telephone #5------------------------------");
        System.out.println("----Telephone #6----");
        Telephone six = new Telephone(telephoneType.satellite);
        System.out.println(six);
        redialedArr = six.getDialedArray();
        six.dialing(2223456);
        six.disconnecting();
        six.redialing();
        six.disconnecting();
        six.dialing(2223457);
        six.disconnecting();
        System.out.println("-----Telephone #6 Dial List-----");
        for (int i = redialedArr.length; i > 0; i--) {
            if (redialedArr[i-1] != 0) {
                System.out.println(redialedArr[i-1]);
            }
        }
        System.out.println(six);
        System.out.println("-----------------end of Telephone #6------------------------------");
        System.out.println("----Telephone #7----");
        Telephone seven = new Telephone(telephoneType.satellite);
        System.out.println(seven);
        seven.redialing();
        System.out.println(seven);
        System.out.println("-----------------end of Telephone #7------------------------------");
        System.out.println("----Telephone #8----");
        Telephone eight = new Telephone(telephoneType.mobile);
        System.out.println(eight);
        eight.dialing(5550008);
        System.out.println(eight);
        System.out.println("-----------------end of Telephone #8------------------------------");
        System.out.println("----Telephone #9----");
        Telephone nine = new Telephone(telephoneType.landline,5550008);
        System.out.println(nine);
        System.out.println("-----------------end of Telephone #9------------------------------");
        System.out.println("----Telephone #10----");
        Telephone ten = new Telephone(telephoneType.satellite,5550008);
        System.out.println(ten);
        System.out.println("-----------------end of Telephone #10------------------------------");
        System.out.println("The total of " + Telephone.counter + " calls were made.");
        System.out.println("-----------------Testing Deep Equality ---------------------------");
        System.out.println("telephone #8 == telephone #9: "+ eight.equals(nine));
        System.out.println("telephone #8 == telephone #5: "+ eight.equals(five)); // Even though they are the same telephone type, returns false due to the difference between the phone numbers.
        System.out.println("telephone #8 == telephone #10: "+ eight.equals(ten));
    }
}

