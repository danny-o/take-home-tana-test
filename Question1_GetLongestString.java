

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question1_GetLongestString {

    public static void main(String[] args){

        // Set needed inputs
        String longestString=getLongestString(
                Arrays.asList('A', 'B', 'C', 'D'),
                Arrays.asList("AABCDA", "ABCDZADC", "ABCDBCA", "ABCDABDCA")
        );

        System.out.printf("Longest String is %s",longestString);
    }

    /*
     * we are required to find the longest string which matches below conditions:
     * 1. No repetitive identical characters
     * 2. Only contains characters among given list of characters
     */

    public static String getLongestString(List<Character> characterConstraints, List<String> strings) {

        String longestString = null;

        // Converting list of characters into a set to reduce lookup time complexity
        // As look up time complexity for sets is O(1)

        Set<Character> characterSet = new HashSet<>(characterConstraints);

        for (String string : strings) {

            // Skip string if it's length is smaller than current longest string
            if (longestString != null && string.length() <= longestString.length()) {
                continue;
            }

            char prevCharacter = 0;

            for (int i = 0; i < string.length(); i++) {
                char currentCharacter = string.charAt(i);
                // Skip String if it has unallowed characters
                if (!characterSet.contains(currentCharacter)) {
                    break;
                }
                // Skip String if it has consecutive identical characters
                if (i > 0 && prevCharacter == currentCharacter) {
                    break;
                }

                if (i == string.length() - 1) {
                    longestString = string;
                }

                prevCharacter = currentCharacter;


            }

        }
        return longestString;
    }




}
