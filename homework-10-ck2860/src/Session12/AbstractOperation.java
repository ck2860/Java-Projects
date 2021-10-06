package Session12;

public abstract class AbstractOperation implements Operation  {
    String operator;

    public AbstractOperation(String operator){
        this.operator = operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public boolean matches(String operatorA) {
        if (this.operator != null && this.operator == "+" || this.operator == "-"){
            return true;
        }
        return false;
    }

}
