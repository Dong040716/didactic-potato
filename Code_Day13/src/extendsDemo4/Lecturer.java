package extendsDemo4;

public class Lecturer extends Teacher {
    //讲师类

    //构造函数
    public Lecturer() {
    }

    public Lecturer(String id, String name, String work) {
        super(id, name, work);
    }

    //内部函数
    @Override
    public void doWork() {
        System.out.println("讲师的工作是讲授课程");
    }
}
