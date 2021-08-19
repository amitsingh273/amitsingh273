package Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter values to calculate");
        double leftVal = sc.nextDouble();
        String operation = sc.next();
        char ch = operation.charAt(0);
        double rightVal = sc.nextDouble();
        double val;


        switch (ch){
            case '+':
                Adder add = new Adder(leftVal,rightVal);
                val =add.calculate();
                break;
            case '-':
                Subtractor sub = new Subtractor(leftVal,rightVal);
                val =sub.calculate();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + ch);
        }
        System.out.println(leftVal + " " + ch + " " + rightVal + " " + " = " + val);
    }
}
