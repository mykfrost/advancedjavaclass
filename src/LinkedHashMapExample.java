import java.util.HashMap;
import java.util.Map;

public class LinkedHashMapExample {


    public static void main(String[] args){
        HashMap <String , Integer> phonebook = new HashMap<>();

        phonebook.put("Kevin" ,2343443);
        phonebook.put("Jill" , 343344);
        phonebook.put("Brenda", 2377);
        phonebook.put("Garry", 95859);
        phonebook.put("Bishop" , 949847);
        System.out.println(phonebook);
        System.out.println("Kevin's Number is "+ phonebook.get("Kevin"));

        System.out.println("\nList of My Contacts in Phonebook: ");
        for(Map.Entry<String , Integer> entry : phonebook.entrySet()){
            System.out.println(entry.getKey()+":"+ entry.getValue());
        }

    }
}
