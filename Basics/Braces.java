package Basics;

public class Braces {
    public static int smallOpen, smallClosed, curlyOpen, curlyClosed, bigOpen, bigClosed =0;
    public static void main(String[] args){
        String braces = "[[{{(())}}]";
        boolean numMatch = checkNumberofbrackets(braces);
        if(numMatch){
            checkOrders(braces);
        }
    }

    private static boolean checkNumberofbrackets(String braces) {
        char[] ch = braces.toCharArray();
        smallOpen = count(ch,'(');
        smallClosed = count(ch,')');
        curlyOpen = count(ch,'{');
        curlyClosed = count(ch,'}');
        bigOpen = count(ch,'[');
        bigClosed = count(ch,']');
        if(smallClosed!=smallOpen) {
            System.out.println("Mismatch in braces: ()" + smallOpen + " " + smallClosed);
            return false;
        }
        else if(curlyOpen!=curlyClosed) {
            System.out.println("Mismatch in braces: {}" + curlyOpen + " " + curlyClosed);
            return false;
        }
        else if(bigOpen!=bigClosed) {
            System.out.println("Mismatch in braces: []" + bigOpen + " " + bigClosed);
            return false;
        }
        else
            return true;
    }

    private static int count(char[] ch, char s) {
        int count =0;
        for(int i =0;i<=ch.length-1;i++){
            if(s==ch[i])
                count++;
        }
        return count;
    }

    private static void checkOrders(String braces){
        for(int j=0;j<3;j++) {
            int count =0;
            for (int i = 0; i <= braces.length() - 1; i++) {
                if(braces.charAt(i) == '('){
                    
                }
            }
        }
    }
}
