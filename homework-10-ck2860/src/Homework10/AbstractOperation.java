/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package Homework10;
/*
 *Answering the question #1 of Homework #10.
 */
public abstract class AbstractOperation implements Operation{
    /**
     * AbstractOperation class implemented one of the methods from the interface.
     * the private field for operator is created.
     */
    String operator;
    /**
     * The constructor that takes an operator in order to create operations and for the matches method.
     * @param operator
     */
    public AbstractOperation(String operator){
        this.operator = operator;
    }
    /**
     * the accessor for operator
     * @return this.operator
     */
    public String getOperator() {
        return this.operator;
    }
    /**
     * The matches method allows you to match the operator and the input operator.
     * @param operator String operator
     * @return the boolean value:true or false
     */
    @Override
    public boolean matches(String operator) {
        if (operator != null){
            if (operator.equals("+")){
                return this.operator.equals("+");
            }else if (operator.equals("-")){
                return this.operator.equals("-");
            }else if (operator.equals("/")){
                return this.operator.equals("/");
            }else if (operator.equals("*")){
                return this.operator.equals("*");
            }else if (operator.equals("//")){
                return this.operator.equals("//");
            }else if (operator.equals("%")) {
                return this.operator.equals("%");
            }else if (operator.equals("^") || operator.equals("**")) {
                if (this.operator.equals("^") || this.operator.equals("**")) {
                    return true;
                }else {
                    return false;
                }
            }else {
                return false;
            }
        }else{
            return false;
        }
    }
}
// end of AbstractOperation Java class.