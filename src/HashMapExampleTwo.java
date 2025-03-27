import java.util.HashMap;
import java.util.Map;

public class HashMapExampleTwo {
    public static void main(String[] args){
        // Run main here

        HashMap<String , String> capitalCities = new HashMap<>();
        capitalCities.put("USA","Washington DC ");
        capitalCities.put("UK","London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("France","Paris");

        // Rettieve a value using its key
        System.out.println("Capital of USA: "+ capitalCities.get("USA"));
        System.out.println("Capital of UK: "+ capitalCities.get("UK"));

        //remove an entry from the list
        System.out.println("Full List: " +capitalCities);
     //   System.out.println("Remove Germany from the list "+ capitalCities.remove("Germany"));
      //  System.out.println(capitalCities);
        //Iterating through a hashmap
        System.out.println("Listing our countries using for loop");
        for(Map.Entry<String, String> entry : capitalCities.entrySet()){

            System.out.println("Country: "+ entry.getKey() +" ,Capital City: "+ entry.getValue());
        }
    }
}
