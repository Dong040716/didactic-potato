package extendsDemo3;

public class Person {
    //属性
    private String id;
    private String name;
    private String salary;

    //构造函数
    public Person() {
    }

    public Person(String id, String name, String salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //get函数
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSalary() {
        return salary;
    }

    //set函数
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    //包含的方法
    public void work() {
        System.out.println("此人在工作");
    }

    public void eat() {
        System.out.println("此人在吃饭");
    }
}
