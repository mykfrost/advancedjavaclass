package userchat;

public class User {
    private static int userCount = 0 ;
    private final int userId;
    private final String userName;
    public User(String userName){
        this.userId = ++userCount;
        this.userName = userName;
    }

    public int getUserId(){
        return userId;
    }
    public String getUserName(){
        return userName;
    }

    @Override
    public String toString(){
        return userName + "(ID : "+userId+")";
    }
}
