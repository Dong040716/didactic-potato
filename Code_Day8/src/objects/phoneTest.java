package objects;

public class phoneTest {
    public static void main(String[] args) {
        //创建对象
        Phone p=new Phone();
        Phone p2=new Phone("华为",2998);
        //给对象赋值
        p.setBrand("小米");
        p.setPrice(1999);
        //获取赋值
        String brand=p.getBrand();
        double price=p.getPrice();
        //打印验证结果
        System.out.println(brand);
        System.out.println(price);
        System.out.println(p2.getBrand());
        System.out.println(p2.getPrice());
    }

}
