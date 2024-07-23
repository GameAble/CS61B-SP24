import org.checkerframework.common.value.qual.EnsuresMinLenIf;

import java.util.*;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        // TODO: Fill in this function.
        Map<Character,Integer> letterToNum = new HashMap<>();
        char ch='a';
        int i=1;
        while(i<=26){
            letterToNum.put(ch, i);
            ch++;
            i++;
        }

        return letterToNum;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        // TODO: Fill in this function.
        Map<Integer,Integer> squares=new HashMap<>();
        for(int i :nums){
            squares.put(i, (int) Math.pow(i,2));
        }
        return squares;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO: Fill in this function.
        Map<String,Integer> countWords=new HashMap<>();
        Set<String> pre = new HashSet<>(words);
        for(String str : pre){
            countWords.put(str,0);
        }
        for (String str : words){
            countWords.put(str, countWords.get(str)+1);
        }
        return countWords;
    }
    public static Map<String, Integer> countWords_2(List<String> words) {
        // TODO: Fill in this function.
        Map<String,Integer> countWords=new HashMap<>();
        for(String str:words){
            countWords.put(str, countWords.getOrDefault(str, 0)+1);
        }
        return countWords;
    }
}















































