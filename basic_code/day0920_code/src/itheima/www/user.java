package itheima.www;

public class user {
    private String userName;
    private int id;
    private String password;

    public user(){}
    public user(String userName,int id,String password){
        this.userName=userName;
        this.id=id;
        this.password=password;
    }

    public void setUserName(String userName){
        this.userName=userName;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getUserName(){
        return userName;
    }
    public int getId(){
        return id;
    }
}
