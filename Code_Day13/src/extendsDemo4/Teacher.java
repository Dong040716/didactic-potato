package extendsDemo4;

public class Teacher extends Employee {
    //教研部员工

    //构造函数
    public Teacher() {
    }

    public Teacher(String id, String name, String work) {
        super(id, name, work);
    }

    //内部函数
    @Override
    public void doWork() {
        System.out.println("教研部的工作是教研工作");
    }
}
