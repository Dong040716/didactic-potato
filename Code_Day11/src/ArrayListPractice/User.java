package ArrayListPractice;

public class User {
    //成员属性：
    private int id;
    private String username;
    private String password;

    //构造函数
    public User() {
    }

    public User(int id, String username, String password) {
        this.password = password;
        this.id = id;
        this.username = username;
    }

    //get函数
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    //set函数
    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
