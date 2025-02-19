package extendsDemo4;

public class Employee {
    //内部成员变量
    private String id;
    private String name;
    private String work;

    //构造函数
    public Employee() {
    }

    public Employee(String id, String name, String work) {
        this.id = id;
        this.name = name;
        this.work = work;
    }
    //get函数

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getWork() {
        return work;
    }

    //set函数
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWork(String work) {
        this.work = work;
    }

    //内部成员函数
    public void doWork() {
        System.out.println("每个员工有不同的工作");
    }
}
