class CalculatorConundrum  extends Exception{
    public String calculate(int operand1, int operand2, String operation)  throws IllegalArgumentException , IllegalOperationException {
        try{
        if (operation == null){
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if (operation == "" || operation.isEmpty()){
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        if(operation == "+")
            return ""+ operand1 + " + " + operand2 + " = " + (operand1+operand2) + "";
        if(operation == "*")
            return ""+ operand1 + " * " + operand2 + " = " + (operand1*operand2) + "";
        if(operation == "/"){
            int res = operand1/operand2;
                return ""+ operand1 + " / " + operand2 + " = " + res + "";
        }
        throw new IllegalOperationException("Operation '"+operation+"' does not exist" );
        } catch(ArithmeticException e){
                   throw new IllegalOperationException("Division by zero is not allowed", e);
            }
    }
}
