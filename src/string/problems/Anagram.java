package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        System.out.println(areAnagram("ARMY","MARY"));
    }
    public static boolean areAnagram(String s1, String s2)
    {
        char[] str1 =new char[s1.length()];
        for(int i=0; i<s1.length();i++){
            str1[i]= s1.charAt(i);
        }
        char[] str2= new char[s2.length()];
        for(int i=0; i<s2.length();i++){
            str2[i]= s2.charAt(i);
        }
        // Get lenghts of both strings
        int n1 = str1.length;
        int n2 = str2.length;

        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
            return false;

        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);

        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;

        return true;
    }
}
