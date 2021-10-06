/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 * The goal of the assignment#05 is to use encapsulation.
 */
package Homework05;
/*
 *Answering the question #4 of Homework #05
 */
public class rateMyProfessors {
    /**
     * Setting private fields for this rateMyProfessors class.
     * So this class has String firstName, String lastName, String universityName, String subject, float quality, and float difficulty.
     */
    private String firstName;
    private String lastName;
    private String universityName;
    private String subject;
    private float  quality;
    private float difficulty;
    /**
     * This initializing constructor that takes all of the fields.
     * The "this" keyword was used to insure that we refer to the field with the names.
     * All of the parameters are set for this.firstName, this.lastName, this.universityName, this.subject, this.quality, and this.difficulty respectively.
     * @param firstName would be assigned to this.firstName
     * @param lastName would be assigned to this.lastName
     * @param universityName would be assigned to this.universityName
     * @param subject would be assigned to this.subject
     * @param quality would be assigned to this.quality and only can be between 1 and 5, if not then assigned to default values.
     * @param difficulty would be assigned to this.difficulty and only can be between 1 and 5, if not then assigned to default values.
     */
    public rateMyProfessors(String firstName, String lastName, String universityName, String subject, float quality, float difficulty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.universityName = universityName;
        this.subject = subject;
        if (quality >= 1 && quality <=5){
            this.quality = quality ;
        }
        if (difficulty >= 1 && difficulty <=5 ) {
            this.difficulty = difficulty;
        }
    }
    /**
     * This "chaining" constructor takes only first name, last name, university name, and subject & sets both of the ratings to default.
     * The "this" keyword was used to insure that we refer to the field with the names.
     * The firstName, lastName, universityName, and subject parameters are set for this.firstName, this.lastName, this.universityName, this.subject respectively.
     * Both of the ratings are set to default value -- 0.
     * @param firstName
     * @param lastName
     * @param universityName
     * @param subject
     */
    public rateMyProfessors(String firstName, String lastName, String universityName, String subject) {
        this(firstName, lastName, universityName, subject, 0, 0);
    }
    /**
     * The accessor is used to get the String of first name
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * The accessor is used to get the String of last name
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * The accessor is used to get the String of university name
     * @return universityName
     */
    public String getUniversityName() {
        return universityName;
    }
    /**
     * The accessor is used to get the String of subject
     * @return subject
     */
    public String getSubject() {
        return subject;
    }
    /**
     *The mutator is used to set the first name
     * @param firstName would be assigned to this.firstName.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     *The mutator is used to set the last name
     * @param lastName would be assigned to this.lastName.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     *The mutator is used to set the university name
     * @param universityName would be assigned to this.universityName.
     */
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
    /**
     * The mutator is used to set the subject
     * @param subject would be assigned to this.subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
    /**
     * Iterations were used to calculate the average rating for the professor, every time a new rating is provided.
     * It has two arguments, one for overall quality and level, with the values from 1 to 5.
     * There is a if statement for each parameter, so it would calculate average for each rating.
     * If the quality score is between 1 to 5, it would execute the statement and re-assign the quality field with the new average score.
     * If the quality score is out of the range, it would not allocated to the rating.
     * If the difficulty score is between 1 to 5, it would execute the statement and re-assign the difficulty field with the new average score.
     * If the difficulty score is out of the range, it would not allocated to the rating.
     */
    int i =1;
    int a =0;
    public void rating(int qualityScore, int difficultyScore) {
       if (qualityScore >=1 && qualityScore <=5){
           i++;
           a++;
           quality = (((quality*a) + qualityScore) /i);
        }
       if (difficultyScore >=1 && difficultyScore <=5) {
            i++;
            a++;
            difficulty = (((difficulty * a) + difficultyScore) / i);
       }
    }
    /**
     * The accessor for quality is used to return the average for overall quality rating.
     * @return quality (overall average)
     */
    public float getOverallQuality(){
        return quality;
   }
    /**
     * the accessor for difficulty is used to return the average for level of difficulty.
     * @return difficulty (overall average)
     */
   public float getOverallDifficulty(){
        return difficulty;
   }
    /**
     *toString method was used to print each field in the formatted string.
     * @return formatted string of rateMyProfessor class' fields: firstName, lastName, universityName, subject, quality, and difficulty.
     */
    @Override
    public String toString() {
        return "rateMyProfessors [first name = " + getFirstName() + ", last name = " + getLastName() + ", university name = " + getUniversityName()
                + ", subject = " + getSubject() + ", overall quality = " + getOverallQuality() + ", level of difficulty = " + getOverallDifficulty() + "]";
    }
}





