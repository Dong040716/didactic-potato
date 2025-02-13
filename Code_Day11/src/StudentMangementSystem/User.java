package StudentMangementSystem;

public class User {
    //用户类所具有的属性：用户名、密码、身份证号码、手机号码
    private String userName;
    private String password;
    private String idNumber;
    private String phoneNumber;

    //构造函数
    public User() {
    }

    public User(String userName, String password, String idNumber, String phoneNumber) {
        this.userName = userName;
        this.password = password;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
    }

    //get函数
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //set函数
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
