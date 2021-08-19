package Calculator;

public abstract class CalcuatorBase {
    double leftVal, rightVal;

    public CalcuatorBase(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public double getLeftVal() {
        return leftVal;
    }

    public double getRightVal(){
        return rightVal;
    }

    public abstract double calculate();
}
