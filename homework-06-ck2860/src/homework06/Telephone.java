/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package homework06;
/*
 *Answering the question #3 of Homework #06
 */
public class Telephone {
    /**
     * Telephone class have a telephoneType type, int telephoneNumber("your"), and int phoneNumber("some else's) as private fields.
     * a static int sequence (for first part of a phone number), a static int number (for iteration) were used as static fields.
     * last static field is added and set it to 0 so it would be incremented when a call is made.
     */
    private telephoneType type;
    private static final int sequence = 5550000;
    private static int number = 0;
    private int telephoneNumber;
    private int phoneNumber;
    public static int counter = 0;
    /**
     * The initializing constructor sets for the type of telephone and int phoneNumber. The "this" keyword was used to insure that we refer
     * to the field with the names. The parameter for telephoneType type amd int yourPhoneNumber are set for this.type and this.telephone.
     * This is for when you want to add the same phone number for the different type of telephone.
     * @param type a type of telephone, would be assigned to this.type
     * @param yourPhoneNumber the phone number that you want to use.
     */
    public Telephone(telephoneType type, int yourPhoneNumber){
        this.type=type;
        this.telephoneNumber = yourPhoneNumber;
    }
    /**
     * The constructor sets for the type field only. The "this" keyword was used to insure that we refer
     * to the field with the names. The parameter for telephoneType type is set for this.type.
     * Also, it would assign the next number of the sequence beginning with 5550001, etc.. and apply to this.telephoneNumber
     * this.telephoneNumber is the concatenation of this.sequence and this.number.
     * @param type would be assigned to this.type.
     */
    public Telephone(telephoneType type) {
        this.number++;
        this.type = type;
        this.telephoneNumber = this.sequence + this.number;
    }
    /**
     * An accessor for telephone type: land line, mobile, or satellite
     * @return telephone type
     */
    public telephoneType getType() {
        return type;
    }
    /**
     * This is an accessor for telephone number.
     * @return telephone number
     */
    public int getTelephoneNumber() {
        return telephoneNumber;
    }
    /**
     * The dialedArray was created in order to add phone numbers in the array that holds 10 phone numbers.
     * the iteration of int i is used in order to move the places so the phone numbers can be saved in the next place, etc..
     * This dialing method would take a phone number to call to see if this phone number isn't its' own phone number, or is in progress, or can call..
     * If this phone couldn't call because it is the same phone number, then it would print an error and saying that you cannot call your own phone number.
     * If a call is already in progress with this phone then it would print an error and wouldn't let you to call.
     * if none of them are true, then the else statement would be executed and the call would be made.
     * In the else statement, the phone numbers would be stored into the array and the counter would be incremented every time it makes a call.
     * If there are more than 10 calls, then the last phone number would be moved to the next place in the array.
     * The current phone number would replace this last phone number in the array as the last (recent) place.
     * and if another call is made, it would go through the for loop, to move the last phone number to next place and assign this current phone number to 9th place in the array.
     * @param phoneNumber a phone number that this phone would like to call
     * @return a boolean call that either return true or false, if the call is made, then its true. Otherwise, false.
     */
    int[] dialedArray = new int[10];
    int i = 0;
    private boolean call = false;
    public boolean dialing(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        if (this.phoneNumber == telephoneNumber) {
            call = false;
            System.out.println("Error, you cannot call your own phone number");
        } else if (call == true) {
            System.out.println("Error, this call is already in progress");
        } else {
            counter = counter + 1;
            call = true;
            System.out.println("The phone is starting a call and to " + this.phoneNumber);
            if (i >= dialedArray.length) {
                int lastPhoneNumber = dialedArray[dialedArray.length - 1];
                int currentPhoneNumber = 0;
                for (int j = dialedArray.length - 1; j >= 1; j--) {
                    currentPhoneNumber = dialedArray[j - 1];
                    dialedArray[j - 1] = lastPhoneNumber;
                    lastPhoneNumber = currentPhoneNumber;
                }
                dialedArray[dialedArray.length - 1] = this.phoneNumber;
            } else {
                dialedArray[i] = this.phoneNumber;
                i++;
            }
        }
        return call;
    }
    /**
     * The boolean canRedial was created for the redialing method.
     * If it is true, then the call can be redialed. Otherwise, false.
     * The disconnecting method was used to disconnect/end the call that would allow this phone to dial/redial
     * If the call is made, then the statement would be executed and set the redial as true that let the phone to call.
     * If the call isn't made then it wouldn't set canRedial to true. It would print an error due the call isn't in progress.
     * @return the boolean value of canRedial.
     */
    private boolean canRedial = false;
    public boolean disconnecting() {
        if (call == true) {
            canRedial = true;
            System.out.println("This call is ending with " + this.phoneNumber);
            call = false; // disconnecting
        } else {
            canRedial = false;
            System.out.println("Error, your call is not in progress. ");
        }
        return canRedial;
    }
    /**
     * This redialing method would either check if there is a call that has been made or not.
     * If there is no call has yet been made then it would print "there is no number to redial.
     * Otherwise, the else executes and would take a phone number to call to see if this phone number isn't its' own phone number, or is in progress, or can call..
     * If this phone couldn't call because it is the same phone number, then it would print an error and saying that you cannot call your own phone number.
     * If a call is already in progress with this phone then it would print an error and wouldn't let you to call.
     * if none of them are true, then the else statement would be executed and the call would be made.
     * In the else statement, the phone numbers would be stored into the array and  the counter would be incremented every time it makes a call.
     * If there are more than 10 calls, then the last phone number would be moved to the next place in the array.
     * The current phone number would replace this last phone number in the array as the last (recent) place.
     * and if another call is made, it would go through the for loop, to move the last phone number to next place and assign this current phone number to 9th place in the array.
     */

    public void redialing() {
        if (canRedial == false) {
            System.out.println("There is no number to redial");
        } else {
            if (this.phoneNumber == telephoneNumber) {
                call = false;
                System.out.println("Error, you cannot call your own phone number");
            } else if (call == true) {
                System.out.println("Error, this call is already in progress");
            } else {
                counter = counter + 1;
                call = true;
                System.out.println("The phone is starting a call and to " + this.phoneNumber);
                if (i >= dialedArray.length) {
                    int lastPhoneNumber = dialedArray[dialedArray.length - 1];
                    int currentPhoneNumber = 0;
                    for (int j = dialedArray.length - 1; j >= 1; j--) {
                        currentPhoneNumber = dialedArray[j - 1];
                        dialedArray[j - 1] = lastPhoneNumber;
                        lastPhoneNumber = currentPhoneNumber;
                    }
                    dialedArray[dialedArray.length - 1] = this.phoneNumber;
                } else {
                    dialedArray[i] = this.phoneNumber;
                    i++;
                }
            }
        }
    }
    /**
     * An accessor for most recently dialed number
     * @return phoneNumber
     */
    public int getMostRecentlyDialedNumber() {
        return this.phoneNumber;
    }

    /**
     * An accessor for an array of 10 most recently dialed numbers that has created in dialing/redialing methods
     * @return dialedArray
     */
    public int[] getDialedArray() {
        return dialedArray;
    }
    /**
     *equals(Object) method was used to test the deep equality between telephones that have the same phone numbers.
     */


    @Override
    public boolean equals(Object obj){
        if(obj instanceof Telephone) {
            Telephone apple = (Telephone)obj;
//            System.out.println(apple);
//            System.out.println(apple.telephoneNumber);
//            System.out.println(this.telephoneNumber);
                return apple.telephoneNumber == this.telephoneNumber;
        }else{
            return false;
        }
    }
    /**
     *toString method was used to print telephone number, telephone type, and most recently dialed number.
     * @return formatted string of telephone class' getters: getTelephone(), getType(), and getmostRecentlyDailedNumber().
     */
    @Override
    public String toString() {
        return "Telephone [ telephone number = " + getTelephoneNumber() + ", type of phone = " + getType() + ", most recently dialed number = " + getMostRecentlyDialedNumber() + "]";
    }
}
// end of Telephone class