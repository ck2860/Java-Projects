package Session12;

public class Sum extends AbstractOperation {
    public Sum(String operator) {
        super(operator);
    }

//    @Override
//    public boolean matches(String operator) {
////        return false;
////    }
//        if (operator == "+"){
//        return true;
//    }
//        return false;
//}

    @Override
    public double operation(double[] operands) {
//        return operands[0]; //return the first value in the array.
//        if (operands == null || operands.length == 0) {
//            return 0;
//        } else {
//            return operands[0];
        if (operands == null || operands.length == 0) {
            return 0;
        } else {
            double total = 0.0d;
            for(double operand : operands){
                total += operand;
            }
            return total;
        }
    }
}
