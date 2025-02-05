package Practice4;

public class Girl {
    //属性
    private String name;
    private int age;
    private String gender;
    private String hobby;

    //构造函数
    public Girl() {
    }

    public Girl(String name, int age, String gender, String hobby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
    }
    //get函数
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getHobby() {
        return hobby;
    }
}
