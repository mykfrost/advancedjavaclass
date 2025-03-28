import java.util.HashMap;
import java.util.Map;

public class ChatApp2 {
    public static void main(String[] arg){
        HashMap<Integer , String> messages = new HashMap<>();
        //Adding messages
        messages.put(1, " Hi User I am user 1 ?");
        messages.put(2, " Hi , how are you user 1");
        messages.put(3, "I am fine user 1");
        // getting message by ID

        System.out.println("Message by ID 2"+ messages.get(2));
        for(Map.Entry<Integer , String>  entry : messages.entrySet()){
            System.out.println("ID : "+ entry.getKey()+" , Message :"+ entry.getValue());
        }

    }
}
