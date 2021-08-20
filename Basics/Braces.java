package Basics;

public class Braces {
    public static int smallOpen, curlyOpen, bigOpen =0;
    public static void main(String[] args){
        String braces = "[[{{((()))}})]]";
        checkOrders(braces);
    }

    private static void checkOrders(String braces){
        for (int i = 0; i <= braces.length() - 1; i++) {
            if(braces.charAt(i) == '(')
                smallOpen++;
            else if(braces.charAt(i) == '{' && smallOpen == 0)
                curlyOpen++;
            else if(braces.charAt(i) == '[' && smallOpen ==0 && curlyOpen == 0)
                bigOpen++;
            else if(braces.charAt(i) == ')')
                smallOpen--;
            else if(braces.charAt(i) == '}' && smallOpen == 0)
                curlyOpen--;
            else if(braces.charAt(i) == '}' && smallOpen != 0) {
                break;
            }
            else if(braces.charAt(i) == ']' && smallOpen == 0 && curlyOpen ==0)
                bigOpen--;
            else if(braces.charAt(i) == ']' && (smallOpen != 0 || curlyOpen !=0)) {
                break;
            }
        }
        if(smallOpen !=0 || curlyOpen !=0 || bigOpen !=0){
            System.out.println("Brackets are not in order");
        }
        else
            System.out.println("Brackets are in order");
    }
}
