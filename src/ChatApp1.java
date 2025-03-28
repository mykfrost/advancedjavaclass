import java.util.LinkedList;

public class ChatApp1 {
    public static void main(String[] args){
        LinkedList<String> chatMessage = new LinkedList();
        chatMessage.add("User 1 : Hi i am user 1");
        chatMessage.add("User 2 : Hi , i am user 2");
        chatMessage.add("User 3 : Hi , i am user 3");

        for(String messages : chatMessage){
            System.out.println(messages);
        }
    }
}
