import java.util.HashMap;

public class Question2_GetFirstUniqueProduct {

    /*
     * Requirement:
     * Find the first unique product from the array
     * */

    static String getFirstUniqueProduct(String[] products) {

        if(products==null){
            return null;
        }

        // Initiate a map to store the frequency of occurrence in the array
        HashMap<String, Integer> occurrenceFrequency = new HashMap<>();

        for (String product : products) {

            // Cater for products with different cases by converting all to lowercase

            occurrenceFrequency.put(
                    product.toLowerCase(),
                    occurrenceFrequency.getOrDefault(product.toLowerCase(), 0) + 1
            );
        }
        // return the first product with a frequency of 1
        for (String product : products) {
            if (occurrenceFrequency.get(product.toLowerCase()) == 1) return product;
        }

        return null;

    }


}
