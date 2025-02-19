package extendsDemo4;

public class Buyer extends AdminStaff {
    public Buyer() {
    }

    public Buyer(String id, String name, String work) {
        super(id, name, work);
    }

    @Override
    public void doWork() {
        System.out.println("采购专员做采购工作");
    }
}
