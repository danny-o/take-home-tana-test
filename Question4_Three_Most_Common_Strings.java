import java.util.*;
import java.util.stream.Collectors;

public class Question4_Three_Most_Common_Strings {


    // Find 3 most common strings arranged in ascending alphabetical order

    /*
     * Requirement:
     * Return an array of three most common strings from an input string in alphabetical order
     * */



    static String[] getThreeMostCommonStrings(String text){

        if(text.isEmpty()){
            return new String[]{};
        }

        // Store string occurrence in a map

        HashMap<String,Integer> frequency = new HashMap<>();

        String[] stringArray= text.split(" ");

        for(String string: stringArray){

            frequency.put(string,frequency.getOrDefault(string,0)+1);
        }

        // Order strings by descending order of occurrence
        Set<Map.Entry<String, Integer>> set =frequency
                .entrySet()
                .stream()
                .sorted(((Comparator<Map.Entry<String, Integer>>) (o1, o2) -> {
                            int compare= Integer.compare(o2.getValue(), o1.getValue());

                            if(compare==0){
                                return o1.getKey().compareTo(o2.getKey());
                            }
                            return compare;
                        })

                )
                .collect(Collectors.toCollection(LinkedHashSet::new));


        // Get top 3 strings with the most occurrence
        // sort them alphabetically
        // map to string array
        return set.stream().limit(3)
                .map(Map.Entry::getKey)
                .sorted()
                .toArray( String[]::new);


    }

    public static void main(String[] args) {

        Test_Question4_Three_Most_Common_Strings.runTests();
    }

}
