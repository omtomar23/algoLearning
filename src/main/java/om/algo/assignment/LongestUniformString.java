package om.algo.assignment;

/**
 *
 *  e.g.
 *      for the input: "abbbccda" the longest uniform substring is "bbb" (which starts at index 1 and is 3 characters long).
 */

import java.util.*;

public class LongestUniformString {

    private static final Map<String, int[]> testCases = new HashMap<String, int[]>();

    static int[] longestUniformSubstring(String input){
        int longestStart = -1;
        int longestLength = 0;
        // your code goes here
        if(Objects.nonNull(input) && !input.trim().isEmpty()) {
            char[] chars = input.toCharArray();
            char previousChar = chars[0];
            int preLongestStart = 0;
            int preLongestLength = 0;
            int currLongestStart = 0;
            int currLongestLength = 1;
            for(int i = 0; i < chars.length; i++) {
                if(previousChar == chars[i]) {
                    currLongestLength++;
                } else {
                    if(currLongestLength > preLongestLength) {
                        preLongestLength = currLongestLength;
                        preLongestStart = currLongestStart;
                    }
                    currLongestStart = i;
                    currLongestLength = 1;
                }
                previousChar = chars[i];
            }

            longestStart = preLongestStart;
            longestLength = preLongestLength;
        }
        System.out.println("longestStart:"+ longestStart+" ,longestLength:"+ longestLength);
        return new int[]{ longestStart, longestLength };
    }

    public static void main(String[] args) {
        testCases.put("", new int[]{-1, 0});
        testCases.put("10000111", new int[]{1, 4});
        testCases.put("aabbbbbCdAA", new int[]{2, 5});

        boolean pass = true;
        for(Map.Entry<String,int[]> testCase : testCases.entrySet()){
            int[] result = longestUniformSubstring(testCase.getKey());
            pass = pass && (Arrays.equals(result, testCase.getValue()));
        }
        if(pass){
            System.out.println("Pass!");
        } else {
            System.out.println("Failed! ");
        }
    }
}