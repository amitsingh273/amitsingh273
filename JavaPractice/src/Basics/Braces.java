package Basics;

import java.util.Stack;

public class Braces {
    public static int smallOpen, curlyOpen, bigOpen =0;
    public static void main(String[] args){
        String braces = "[(])";
        checkOrders(braces);

        //Check checkOrdersUsingStack
        if(checkOrdersUsingStack(braces))
            System.out.println("Brackets are in order");
        else
            System.out.println("Brackets are not in order");
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

    private static boolean checkOrdersUsingStack(String braces){
        Stack<Character> stack = new Stack<>();
        char[] ch = braces.toCharArray();
        char check;
        for(int i =0; i<=ch.length-1;i++){
            if(ch[i] == '(' || ch[i] == '{' || ch[i] =='['){
                stack.push(ch[i]);
            }
            else {
                if(stack.isEmpty())
                    return false;
                check = stack.pop();
                switch (check) {
                    case '(':
                        if (ch[i] == ')')
                            continue;
                        else
                            return false;
                    case '{':
                        if (ch[i] == '}')
                            continue;
                        else
                            return false;
                    case '[':
                        if (ch[i] == ']')
                            continue;
                        else
                            return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
