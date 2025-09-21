import java.util.ArrayList;
import java.util.List;

public class Question5_RotateList {


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

        // add elements whose index will reduce to the beginning of the list

        rotatedList.addAll(list.subList(listSize-computedShift,listSize));

        // add remaining elements to the rest end of list
        rotatedList.addAll(list.subList(0,listSize-computedShift));
        return rotatedList;

    }
}
