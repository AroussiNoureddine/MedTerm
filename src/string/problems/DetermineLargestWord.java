package string.problems;

import java.text.BreakIterator;
import java.util.*;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement
        System.out.println(wordNLength);

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement
        List<String> words = new ArrayList<String>();
        BreakIterator breakIterator = BreakIterator.getWordInstance();
        breakIterator.setText(wordGiven);
        int lastIndex = breakIterator.first();
        while (BreakIterator.DONE != lastIndex) {
            int firstIndex = lastIndex;
            lastIndex = breakIterator.next();
            if (lastIndex != BreakIterator.DONE && Character.isLetterOrDigit(wordGiven.charAt(firstIndex))) {
                words.add(wordGiven.substring(firstIndex, lastIndex));
            }
        }
        int max =0;
        for (String s:words) {
            if (max< s.length()) {max = s.length();st=s;}
        }
        map.put(max,st);
        return map;
    }
}
