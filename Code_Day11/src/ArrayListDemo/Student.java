package ArrayListDemo;

public class Student {
    //私有化成员变量
    private String name;
    private int age;

    //构造方法
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //get函数
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    //set函数
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
