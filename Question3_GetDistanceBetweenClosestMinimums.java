public class Question3_GetDistanceBetweenClosestMinimums {



    /*
     * Requirement:
     * Find distance between the closest minimums in an array of integers
     * Constraint: a minimums is guaranteed to occur at least 2 times
     * */

    public static int getDistanceBetweenClosestMinimums(int[] numbers) {

        // Initial values
        Integer smallestNumber=null;
        Integer latestPosition = null;
        int smallestDistance = -1;

        for(int i=0;i<numbers.length;i++){
            int number=numbers[i];
            // if we are the beginning of the array or small number has been found
            if(smallestNumber==null || number<smallestNumber){
                smallestNumber=number;
                latestPosition=i;
                smallestDistance=-1;
                continue;
            }

            // update the smallest distance if a number matching smallest number is found
            if(number==smallestNumber){
                if(smallestDistance==-1 ||(i-latestPosition)<smallestDistance){

                   smallestDistance=i-latestPosition;
                }
                latestPosition=i;
            }


        }

        return smallestDistance;

    }
}
