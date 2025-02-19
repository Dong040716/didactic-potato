package extendsDemo3;

public class Cook extends Person {

    //构造方法
    public Cook() {
    }

    public Cook(String id, String name, String salary) {
        super(id, name, salary);
    }

    //重写函数
    @Override
    public void work() {
        System.out.println("厨师的工作是炒菜");
    }

    @Override
    public void eat() {
        System.out.println("此人在吃米饭");
    }
}
