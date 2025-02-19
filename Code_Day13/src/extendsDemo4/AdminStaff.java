package extendsDemo4;

public class AdminStaff extends Employee{

    //构造函数
    public AdminStaff() {
    }

    public AdminStaff(String id, String name, String work) {
        super(id, name, work);
    }
    //内部函数
    @Override
    public void doWork(){
        System.out.println("行政部的工作是行政工作");
    }
}
