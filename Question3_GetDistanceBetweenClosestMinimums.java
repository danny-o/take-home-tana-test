import java.util.Arrays;

public class Question3_GetDistanceBetweenClosestMinimums {

    public static void main(String[] args) {

        // Set needed inputs
        int[] numberArray = new int[]{1, 2, 3, 1, 4, 5, 2};

        int smallestDistance = getDistanceBetweenClosestMinimums(numberArray);

        System.out.printf("Smallest distance between minimums for array %s is  %d", Arrays.toString(numberArray), smallestDistance);
    }


    /*
     * Requirement:
     * Find distance between the closest minimums in an array of integers
     * Constraint: a minimums is guaranteed to occur at least 2 times
     * */

    public static int getDistanceBetweenClosestMinimums(int[] numbers) {

        // Initial values
        Integer smallestNumber = null;
        Integer latestPosition = null;
        int smallestDistance = -1;

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            // if we are the beginning of the array or small number has been found
            if (smallestNumber == null || number < smallestNumber) {
                smallestNumber = number;
                latestPosition = i;
                smallestDistance = -1;
                continue;
            }

            // update the smallest distance if a number matching smallest number is found
            if (number == smallestNumber) {
                if (smallestDistance == -1 || (i - latestPosition) < smallestDistance) {

                    smallestDistance = i - latestPosition;
                }
                latestPosition = i;
            }


        }

        return smallestDistance;

    }
}
