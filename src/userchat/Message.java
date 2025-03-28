package userchat;

public class Message {
    private static int messageCount = 0 ;
    private final int messageId ;
    private final String content ;
    private  final User sender ;
    private final long timestamp;


    public Message( String content, User sender) {
        this.messageId = ++messageCount;
        this.content = content;
        this.sender = sender;
        this.timestamp = System.currentTimeMillis();
    }

    public int getMessageId() {
        return messageId;
    }

    public static int getMessageCount() {
        return messageCount;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getContent() {
        return content;
    }

    public User getSender() {
        return sender;
    }


}
