package Calculator;

public class Subtractor extends CalcuatorBase {
    public Subtractor(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public double calculate() {
        double val = leftVal - rightVal;
        return val;
    }
}
