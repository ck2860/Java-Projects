package Session12;

import Session12.Operation;

public class Difference extends AbstractOperation {

    public Difference(String operator) {
        super(operator);
    }


//    @Override
//    public boolean matches(String operator) {
////        return false;
////    }
//        if (operator == "-") {
//            return true;
//        }
//        return false;
//    }

    @Override
    public double operation(double[] operands) {
//        return operands[0];
        if (operands == null || operands.length == 0) {
            return 0;
        } else {
            double result = operands[0];
            for(int i=1; i < operands.length; i++){
                result -= operands[i];
            }
            return result;
        }
    }
}
