package Basics;

public class Fibonacci {
    public static void main(String args[]) {
        int till = 15;
        int start = 0, next = 1;
        System.out.print(start + " " + next);
        for(int i = 1; i<till-1; i++){
            int num = start + next;
            start = next;
            next = num;
            System.out.print(" " + num);
        }
    }
}
