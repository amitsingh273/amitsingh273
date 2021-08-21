package Basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Reverse_String {
    public static void main(String args[]){
        String string = "learn Java";
        method1(string);
        method2(string);
        method3(string);
        method4(string);
        method5(string);
    }

    static void method1(String string){
        String newString = "";
        for(int i=string.length()-1; i>=0; i--){
            newString +=  string.charAt(i);
        }
        System.out.println(newString);
    }

    static void method2(String string){
        char[] chars = string.toCharArray();
        for(int i = 0,j = chars.length-1; i<j; i++,j--){
            char temp = chars[j];
            chars[j]= chars[i];
            chars[i] = temp;
        }
        System.out.println(chars);
    }

    static void method3(String string){
        StringBuilder newString = new StringBuilder(string);
        newString.reverse();
        System.out.println(newString);
    }

    static void method4(String string){
        char[] chars = string.toCharArray();
        String rev = "";
        for(int i = chars.length-1; i>=0; i--){
            rev += chars[i];
        }
        System.out.println(rev);
    }

    static void method5(String string){
        char[] chars = string.toCharArray();
        List<Character> rev = new ArrayList<Character>();
        for(char c: chars)
            rev.add(c);
        Collections.reverse(rev);
        System.out.println(rev);
    }
}
