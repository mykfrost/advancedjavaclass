import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ChatWithComments
{
    public static void main(String[] args){
        HashMap<Integer ,String  > messages = new HashMap<>();
        //Add new Messages

        messages.put(1,"Hello User Number 1");
        messages.put(2," Hello , howa are you ?");

        // store comments (replies)

        HashMap<Integer , List<String>> coments = new HashMap<>();
        coments.putIfAbsent(1, new ArrayList<>());
        coments.get(1).add("User 3: Hey User 1");
        coments.get(1).add("User4 : Hello newbie , welcome to ChatWithComments");
        //Display messages and comments
        for(int messageID : messages.keySet()){
            System.out.println(messages.get(messageID));
            if(coments.containsKey(messageID)){
                for( String reply : coments.get(messageID)){
                    System.out.println("  ↳ " + reply);
                }
            }
        }


    }
}
