package userchat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ChatApp4 {
    // Create Objects to store our messages and our comments
    final static List<Message> messages = new ArrayList<>();
    final static HashMap<Integer, List<Comment>> comments = new HashMap<>();
    public static void main(String[] args){


        //Create the users

        User user1 = new User("Alice");
        User user2 = new User("Bob");
        User user3 = new User("Charlie");

        //Add their message
        Message msg1 = new Message("Hey there guys",user1);
        Message msg2 = new Message("Hey Alice",user2);
        Message msg3 = new Message("How are you all ?",user3);
        //Add the messages to our messages list

        messages.add(msg1);
        messages.add(msg2);
        messages.add(msg3);

        //Users commenting on the messages
        addComment(new Comment("Welcome Bob",user1,msg2.getMessageId()));
        addComment(new Comment("Doing great. You ?",user1,msg2.getMessageId()));
        addComment(new Comment("Same Here", user2, msg3.getMessageId()));

        displayChat();
    }
private static void displayChat(){
        for(Message message : messages){
            System.out.println(message);
            if(comments.containsKey(message.getMessageId())){
                for(Comment comment : comments.get(message.getMessageId())) {
                    System.out.println(comment);
                }
            }
        }
}
    private static   void addComment(Comment comment){
        comments.putIfAbsent(comment.getMessageId(), new ArrayList<>());
        comments.get(comment.getMessageId()).add(comment);
    }
}
