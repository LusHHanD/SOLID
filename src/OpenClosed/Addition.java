package OpenClosed;

public class Addition implements IOperation{
    private double firstOperand;
    private double secondOperand;
    private double result = 0.0;
   
    public Addition(double firstOperand, double secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }
 
    //Getter and setter
 
    @Override
    public void performOperation() {
    result = firstOperand + secondOperand;
    }
}
