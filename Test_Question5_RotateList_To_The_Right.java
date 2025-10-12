import java.util.*;

public class Test_Question5_RotateList_To_The_Right {


    public static void main(String[] args) {
        runTests();
    }

    static void runTests() {

        runTest(
                "Test list of unique strings",
                List.of("a", "b", "c"),
                2,
                List.of("b", "c", "a")
        );

        runTest(
                "Test empty list",
                List.of(),
                2,
                List.of()
        );

        runTest(
                "Test 1-item list",
                List.of("a"),
                2,
                List.of("a")
        );
        runTest(
                "Test shift greater than size of list",
                List.of("a", "b", "c", "d"),
                10,
                List.of("c", "d", "a", "b")
        );

        runTest(
                "Test shift as a multiple  of size of list",
                List.of("a", "b", "c", "d"),
                8,
                List.of("a", "b", "c", "d")
        );
        runTest(
                "Test list with duplicates",
                List.of("a", "a", "c", "d"),
                3,
                List.of("a", "c", "d", "a")
        );


        runTest(
                "Test list with empty strings",
                List.of("a", "a", "c", ""),
                3,
                List.of("a", "c", "", "a")
        );


    }

    public static void runTest(String name, List<String> list, int shift, List<String> expected) {

        List<String> result = Question5_RotateList_To_The_Right.rotateList(shift, list);
        boolean pass = result.equals(expected);
        System.out.printf("[%s] %s %s%n",
                pass ? "PASS" : "FAIL",
                name,
                pass ? "" : "-> Expected: " + Arrays.toString(expected.toArray()) + " but got: " + Arrays.toString(result.toArray())
        );
    }
}
