import java.util.Objects;

public class Question2_GetFirstUniqueProductTest {


    public static void main(String[] args) {
        runTests();
    }

    static void runTests() {

        runTest(
                "Test unique product has first occurrence in array",
                new String[]{"Apple", "Computer", "Apple", "Bag","Computer","Charger"},
                "Bag"
        );

        runTest(
                "Test unique product has last occurrence in array",
                new String[]{"Apple", "Bag", "Apple", "Bag","Computer","Computer","Charger"},
                "Charger"
        );

        runTest(
                "Test no unique product in array",
                new String[]{"Apple", "Computer", "Apple", "Bag","Computer","Bag"},
                null
        );

        runTest(
                "Test all products are unique",
                new String[]{"Apple", "Computer", "Bag","Charger"},
                "Apple"
        );

        runTest(
                "Test empty array",
                new String[]{},
                null
        );

        runTest(
                "Test null array",
                null,
                null
        );

        runTest(
                "Test empty array",
                new String[]{},
                null
        );

        runTest(
                "Test single product in array",
                new String[]{"Computer"},
                "Computer"
        );

        runTest(
                "Test case sensitivity",
                new String[]{"Apple", "Computer", "apple", "Bag","COMPUTER","bag","Charger"},
                "Charger"
        );



    }

    public static void runTest(String name, String[] strings, String expected) {

        String result = Question2_GetFirstUniqueProduct.getFirstUniqueProduct(strings);
        boolean pass = Objects.equals(result, expected);
        System.out.printf("[%s] %s %s%n",
                pass ? "PASS" : "FAIL",
                name,
                pass ? "" : "-> Expected: " + expected + " but got: " + result
        );
    }

}
