import java.util.HashMap;

public class HashMapExample {


    public static void main(String[] args){
        HashMap <String , Integer> phonebook = new HashMap<>();

        phonebook.put("Mike " ,2343443);
        phonebook.put("Okello" , 343344);
        phonebook.put("Betty", 2377);
        phonebook.put("Kevin", 95859);
        phonebook.put("Bishop" , 949847);
        System.out.println(phonebook);

        if (phonebook.containsKey("Okello")){
            phonebook.remove("Okello");
        }
        System.out.println("Key Okello Removed");
        System.out.println("New Phonebook: "+phonebook);
        // To remove all phonebooks
        phonebook.clear();
    }
}
