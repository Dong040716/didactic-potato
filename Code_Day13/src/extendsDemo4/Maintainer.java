package extendsDemo4;

public class Maintainer extends AdminStaff{
    //维护专员类

    public Maintainer() {
    }

    public Maintainer(String id, String name, String work) {
        super(id, name, work);
    }
    //内部函数
    @Override
    public void doWork(){
        System.out.println("维护专员做维护工作");
    }
}
