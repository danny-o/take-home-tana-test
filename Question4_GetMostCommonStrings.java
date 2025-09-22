import java.util.*;

public class Question4_GetMostCommonStrings {

    public static void main(String[] args) {

        // Set needed inputs
        String inputString = "hi there care to discuss algorithm basis or how to solve algorithm or";

        String[] commonStrings = getMostCommonStrings(inputString);

        System.out.printf(" 3 Most common strings in alphabetical order are %s", Arrays.toString(commonStrings));
    }

    /*
     * Requirement:
     * Return an array of three most common strings from an input string in alphabetical order
     * */

    static String[] getMostCommonStrings(String text) {

        // store frequency of occurrence for all strings in a map

        HashMap<String, Integer> frequencyMap = new HashMap<>();

        for (String string : text.split(" ")) {
            if (!string.isEmpty()) {
                frequencyMap.put(string, frequencyMap.getOrDefault(string, 0) + 1);
            }

        }

        /*
         * Get 3 most common strings by
         * 1. Sorting the map in descending order of frequency.
         * 2. Getting the first 3 entries
         * 3. Transforming the map to a List of strings
         * 4. Sorting the list alphabetically
         *
         * resulting solution has time complexity of O(n + m log m) and space complexity O(m)
         */

        return frequencyMap.entrySet()
                .stream().sorted((entry1, entry2) -> {
                    int compare = Integer.compare(entry2.getValue(), entry1.getValue());
                    if (compare != 0) {
                        return compare;
                    }
                    return entry1.getKey().compareTo(entry2.getKey());
                })
                .limit(3)
                .map(Map.Entry::getKey)
                .sorted()
                .toArray(String[]::new);

    }
}
