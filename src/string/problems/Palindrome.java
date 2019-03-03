package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        System.out.println(palindrome("MOM"));

    }
    public static boolean palindrome(String s){
        boolean b=false;
        int l=s.length();
        for (int i = 0; i < l/2; i++) {
            if (s.charAt(i)==s.charAt(l-i-1)) b= true;
            else {b= false;break;}
        }
        return b;
    }
}
