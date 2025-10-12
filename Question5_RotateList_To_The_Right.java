import java.util.ArrayList;
import java.util.List;

public class Question5_RotateList_To_The_Right {


    /*
     * Requirement:
     * rotate list to the right by number n
     * */

      static <T> List<T> rotateList(int shift,List<T> list){

          // return original list is empty or shift is 0
          // or a multiple of the list size
          if(list.isEmpty() || shift==0 || shift%list.size()==0){
              return list;
          }


          List<T> newList = new ArrayList<>();



          int actualShift=shift;

          if(actualShift>list.size()){
              actualShift=shift%list.size();
          }


          // Add elements expected to move to beginning of new list
          // These are those whose index is in the range (list size-shift) to listSize

          newList.addAll(list.subList(list.size()-actualShift,list.size()));


          // Then elements expected to be last in the list
          // These are those whose index is in the range 0 to (list size-shift)

          newList.addAll(list.subList(0,list.size()-actualShift));


          return newList;



    }

    public static void main(String[] args) {

      Test_Question5_RotateList_To_The_Right.runTests();
    }
}
