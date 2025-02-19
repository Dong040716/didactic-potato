package extendsDemo3;


public class test {
    public static void main(String[] args) {
        Manegr m = new Manegr("001", "zhangsan", "6000", "4000");
        System.out.println(m.getId() + m.getName() + m.getSalary() + m.getManageBonus());
        m.work();
        Cook c = new Cook();
        c.setId("oo2");
        c.setName("lisi");
        c.setSalary("3000");
        System.out.println(c.getId() + c.getName() + c.getSalary());
        c.work();
    }
}
