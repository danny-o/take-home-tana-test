import java.util.Arrays;

public class Question4_GetMostCommonStringsTest {


    public static void main(String[] args) {
        runTests();
    }

    static void runTests() {

        runTest(
                "Test 3-word string",
                "a b c",
                new String[]{"a","b","c"}
        );

        runTest(
                "Test more than 3 words each with one occurrence",
                "a b c d e f",
                new String[]{"a","b", "c"}
        );


        runTest(
                "Test for 3 words with same frequency of occurrence",
                "hi there care to discuss algorithm basis or how to solve algorithm or",
                new String[]{"algorithm", "or","to"}
        );

        runTest(
                "Test all strings being most common",
                "m n o m n o m n o p p p p",
                new String[]{"m","n", "p"}
        );

        runTest(
                "Test one unique word repeated multiple time",
                "Hello Hello Hello Hello",
                new String[]{"Hello"}
        );

        runTest(
                "Test empty string",
                "",
                new String[]{}
        );





    }

    public static void runTest(String name, String text, String[] expected) {

        String[] result = Question4_GetMostCommonStrings.getMostCommonStrings(text);
        boolean pass = Arrays.equals(result, expected);
        System.out.printf("[%s] %s %s%n",
                pass ? "PASS" : "FAIL",
                name,
                pass ? "" : "-> Expected: " + Arrays.toString(expected) + " but got: " + Arrays.toString(result)
        );
    }
}
