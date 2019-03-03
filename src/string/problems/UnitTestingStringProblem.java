package string.problems;

import org.testng.Assert;

import java.util.Map;

import static string.problems.Anagram.areAnagram;
import static string.problems.DetermineLargestWord.findTheLargestWord;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        boolean b= areAnagram("ARMY","MARY");
        Assert.assertEquals(b,true);
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        Assert.assertEquals(wordNLength.toString(),"10 biological");

    }
}
