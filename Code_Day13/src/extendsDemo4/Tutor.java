package extendsDemo4;

public class Tutor extends Teacher {
    //助教类

    //构造函数
    public Tutor() {
    }

    public Tutor(String id, String name, String work) {
        super(id, name, work);
    }
    //内部函数

    @Override
    public void doWork() {
        System.out.println("助教的工作是协助教学工作");
    }
}
