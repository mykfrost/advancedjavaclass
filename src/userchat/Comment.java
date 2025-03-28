package userchat;

public class Comment {
    private static  int commentCount = 0 ;
    private final int commentId;
    private final String content;
    private final User sender;
    private  final int messageID;

    public Comment(String content, User sender , int messageID){
        this.commentId = ++ commentCount;
        this.content = content;
        this.sender = sender;
        this.messageID = messageID;
    }
    public int getCommentId() {
        return commentId;
    }

    public String getContent() {
        return content;
    }

    public User getSender() {
        return sender;
    }

    public int getMessageId() {
        return messageID;
    }

    @Override
    public String toString() {
        return "   ↳ " + sender.getUserName() + ": " + content + " (Comment ID: " + commentId + ")";
    }
}
