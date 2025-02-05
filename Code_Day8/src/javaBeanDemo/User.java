package javaBeanDemo;

public class User {
    //属性
    private String userName;
    private String password;
    private String email;
    private String gender;
    private int age;

    //空参构造
    public User(){}

    //带参数的构造方法
    public User(String userName,String password,String email,String gender,int age){
        this.userName=userName;
        this.password=password;
        this.email=email;
        this.gender=gender;
        this.age=age;
    }

    //get方法
    public String getUserName() {
        return userName;
    }
    public String getPassword(){
        return password;
    }
    public String getEmail() {
        return email;
    }
    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
    //set方法
    public void setUserName(String userName){
        this.userName=userName;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
