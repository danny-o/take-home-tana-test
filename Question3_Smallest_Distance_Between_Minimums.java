public class Question3_Smallest_Distance_Between_Minimums {


    /*
     * Requirement:
     * Find distance between the closest minimums in an array of integers
     * Constraint: a minimums is guaranteed to occur at least 2 times
     * */


    static int getDistanceBetweenClosestMinimums(int[] integerArray){



        int smallestDistance =Integer.MAX_VALUE;

        int currentSmallestNumber=Integer.MAX_VALUE;

        int currentSmallestNumberIndex = Integer.MAX_VALUE;

        // Keep track of the smallest number
        // get the smallest distance  to its counterpart
        for(int index=0; index< integerArray.length; index++){

            int currentNumber = integerArray[index];

            if(currentNumber<currentSmallestNumber){

                currentSmallestNumber=currentNumber;

                currentSmallestNumberIndex=index;

                // reset smallest distance
                smallestDistance=Integer.MAX_VALUE;
                continue;
            }

            if(currentNumber==currentSmallestNumber){

                if((index-currentSmallestNumberIndex)<smallestDistance){
                    smallestDistance=index-currentSmallestNumberIndex;

                }

                currentSmallestNumberIndex=index;


            }


        }

        return smallestDistance;


    }


    public static void main(String[] args){

       Test_Question3_Smallest_Distance_Between_Closest_Minimums.runTests();

    }

}
