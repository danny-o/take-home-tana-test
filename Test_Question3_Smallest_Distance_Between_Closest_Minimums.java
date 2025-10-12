public class Test_Question3_Smallest_Distance_Between_Closest_Minimums {

    public static void main(String[] args) {
        runTests();
    }

    static void runTests() {

        runTest(
                "Test two occurrences of a minimum number",
                new int[]{1, 2, 3, 1, 4, 5, 2},
                3
        );

        runTest(
                "Test more than two occurrences of a minimum number",
                new int[]{1, 2, 3, 1, 1, 5, 2, 1, 4, 1},
                1
        );

        runTest(
                "Test 0 as a minimum",
                new int[]{1, 9, 0, 8, 2, 0, 3, 0},
                2
        );


        runTest(
                "Test negative integers",
                new int[]{-1, 2, -1, 3, -2, 3, -2, 4, 3, -2},
                2
        );

        runTest(
                "Test an array of 2 numnbers",
                new int[]{2, 2},
                1
        );

        runTest(
                "Test minimums on extreme ends of the array",
                new int[]{1, 2, 4, 5, 6, 7, 4, 2, 1},
                8
        );

    }

    public static void runTest(String name, int[] numbers, int expected) {

        int result = Question3_Smallest_Distance_Between_Minimums.getDistanceBetweenClosestMinimums(numbers);
        boolean pass = result == expected;
        System.out.printf("[%s] %s %s%n",
                pass ? "PASS" : "FAIL",
                name,
                pass ? "" : "-> Expected: " + expected + " but got: " + result
        );
    }

}
