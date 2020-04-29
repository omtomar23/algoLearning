package om.algo.assignment;

/**
 * Pangram FInder
 *
 * The sentence "The quick brown fox jumps over the lazy dog" contains
 * every single letter in the alphabet. Such sentences are called pangrams.
 * Write a function findMissingLetters, which takes a String `sentence`,
 * and returns all the letters it is missing
 *
 */

public class Panagram {
    private static class PanagramDetector {
        private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

        public String findMissingLetters(String sentence) {
            //step 1: fill all char place to '0'
            int[] arr = new int['z'+1];
            for(int i = 'a'; i <='z'; i++){
                arr[i] = 0;
            }

            //step 2: mark all finding char exist in given sentence
            char[] chars = sentence.toLowerCase().toCharArray();
            for(int i = 0; i < chars.length; i++) {
                if(arr[chars[i]] == 0) {
                    arr[chars[i]] = 1;
                }
            }

            //step 3: find all un mark chars
            char[] missingChars = new char[123];
            for(int i = 'a'; i <='z'; i++) {
                if(arr[i] == 0) {
                    missingChars[i] = (char)i;
                }
            }
            return new String(missingChars).trim();
        }

    }

    public static void main(String[] args) {
        PanagramDetector pd = new PanagramDetector();
        boolean success = true;

        success = success && "".equals(pd.findMissingLetters("The quick brown fox jumps over the lazy dog"));
        success = success && "abcdefghijklmnopqrstuvwxyz".equals(pd.findMissingLetters(""));

        if (success) {
            System.out.println("Pass ");
        } else {
            System.out.println("Failed");
        }
    }
}
