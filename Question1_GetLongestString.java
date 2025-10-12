import java.util.*;

public class Question1_GetLongestString {


    /* Requirement
     * Find the longest string which matching below conditions:
     * 1. No repetitive identical characters
     * 2. Only contains characters among given list of characters
     */

    static String getLongestString(List<Character> validCharacters, String[] strings){


        // Store characters list in a set to optimise lookup
        // as sets have a lookup time of O(1)

        Set<Character> validCharacterSet = new HashSet<>(validCharacters);


        // sort strings from longest to shortest
        Arrays.sort(strings, (a,b)->b.length()-a.length());

        String longestString = null;

        for(String string : strings){

            char prevCharacter = 0;

            for(int i=0; i<string.length(); i++){
                char currentChar = string.charAt(i);
                if(!validCharacterSet.contains(currentChar)){
                    break;
                }
                if(i>0 && currentChar==prevCharacter){
                   break;
                }
                if(i==string.length()-1){
                    longestString=string;
                }

                prevCharacter=currentChar;

            }

            if(longestString != null){
                break;
            }


        }

        return longestString;



    }

   public static void main(String[] args){

       Test_Question1_GetLongestString.runTests();


   }




}
