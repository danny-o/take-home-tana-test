import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class Test_Question1_GetLongestString {


    public static void main(String[] args) {
        runTests();
    }

    static void runTests() {
        List<Character> ABCD = Arrays.asList('A', 'B', 'C', 'D');

        runTest(
                "Test list with strings meeting conditions",
                ABCD,
                Arrays.asList("AABCDA", "ABCDZADC", "ABCDBCA", "ABCDABDCA"),
                "ABCDABDCA"
        );

        runTest(
                "Test list with no strings meeting set conditions",
                Arrays.asList('A', 'B'),
                Arrays.asList("AAB", "ABB"),
                null
        );

        runTest(
                "Test non-consecutive identical characters",
                Arrays.asList('A', 'B', 'C', 'D'),
                Arrays.asList("ABCA", "ACBA", "ABCDA"),
                "ABCDA"
        );
        runTest(
                "Test list of strings with unallowed characters",
                Arrays.asList('A', 'B'),
                Arrays.asList("AC", "BCA"),
                null
        );


        runTest(
                "Test empty string list",
                ABCD,
                Collections.emptyList(),
                null
        );

        runTest(
                "Test empty list of required characters",
                Collections.emptyList(),
                List.of("ABC"),
                null
        );

        runTest(
                "Test empty string inside list of strings",
                Arrays.asList('A', 'B'),
                Arrays.asList("", "A"),
                "A"
        );

        runTest(
                "Test case sensitivity",
                Arrays.asList('a', 'b'),
                Arrays.asList("AB", "ab"),
                "ab"
        );

        String longValid = "AB".repeat(5000);
        runTest(
                "Test very long string in list",
                Arrays.asList('A', 'B'),
                Arrays.asList(longValid, "A"),
                longValid
        );
    }

    public static void runTest(String name, List<Character> valid, List<String> strings, String expected) {

        String result = Question1_GetLongestString.getLongestString(valid, strings);
        boolean pass = Objects.equals(result, expected);
        System.out.printf("[%s] %s %s%n",
                pass ? "PASS" : "FAIL",
                name,
                pass ? "" : "-> Expected: " + expected + " but got: " + result
        );
    }


}
