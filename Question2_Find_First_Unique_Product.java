import java.util.HashMap;

public class Question2_Find_First_Unique_Product {


    /*
     * Requirement:
     * Find the first unique product from the array
     * */


    static String findFirstUniqueProduct(String[] products){
        // Edge case for when the array is null
        if(products==null){
            return null;
        }

        HashMap<String, Integer> frequencyMap = new HashMap<>();

        // Store frequency of occurrence  in hashmap

        for(String string : products){

            String lowerCaseString = string.toLowerCase();

            frequencyMap.put(lowerCaseString,frequencyMap.getOrDefault(lowerCaseString,0)+1);
        }

        // get first string with a single occurrence
        for(String product: products){

            if(frequencyMap.get(product.toLowerCase())==1){
                return product;
            }
        }


        return null;



    }


    public static void main(String[] args){

       Test_Question2_Find_First_Unique_Product.runTests();

    }

}
