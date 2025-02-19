package extendsDemo3;

public class Manegr extends Person {
    //属性
    private String manageBonus;

    //构造方法
    public Manegr() {
    }

    public Manegr(String id, String name, String salary, String manageBonus) {
        super(id, name, salary);
        this.manageBonus = manageBonus;
    }

    //get函数
    public String getManageBonus() {
        return manageBonus;
    }

    //set函数
    public void setManageBonus(String manageBonus) {
        this.manageBonus = manageBonus;
    }

    //重写函数
    @Override
    public void work() {
        System.out.println("经理的工作是管理其它人");
    }

    @Override
    public void eat() {
        System.out.println("此人在吃米饭");
    }
}
