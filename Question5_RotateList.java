import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question5_RotateList {


    public static void main(String[] args){

        // Set needed inputs
        List<String> inputList= List.of("ID_A01","ID_A02","ID_A03","ID_A04","ID_A05","ID_A06");

        int shift = 2;

        List<String> rotateList=rotateList(inputList,shift);

        System.out.printf("Output list after shifting list by %d is %s:",shift,rotateList );
    }

    /*
    * Requirement:
    * rotate list to the right by number n
    * */

    static List<String> rotateList(List<String> list, int shift){

        // return if list is empty
        // or shift is a multiple of list size
        if(list.isEmpty() || shift%list.size() ==0){
            return list;
        }

        List<String> rotatedList = new ArrayList<>();

        int listSize=list.size();
        int computedShift =shift%listSize;

        // add elements expected to move to the beginning of the list
;
        rotatedList.addAll(list.subList(listSize-computedShift,listSize));

        // add remaining elements to the rest end of list
        rotatedList.addAll(list.subList(0,listSize-computedShift));
        return rotatedList;

    }
}
