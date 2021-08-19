package Calculator;

public class Adder extends CalcuatorBase {
    public Adder(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public double calculate() {
        double val = leftVal + rightVal;
         return val;
    }
}
