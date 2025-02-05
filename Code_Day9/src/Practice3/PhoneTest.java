package Practice3;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        //创建一个存储三部手机的数组
        Phone[] arrTest=new Phone[3];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arrTest.length; i++) {
            //创建对象接收Scanner类的数据
            Phone p=new Phone();
            //输入数据并赋值给Phone对象
            System.out.printf("请输入第%s部手机的品牌:",i+1);
            String brand=sc.next();
            p.setBrand(brand);
            System.out.printf("请输入第%s部手机的价格:",i+1);
            double price=sc.nextDouble();
            p.setPrice(price);
            System.out.printf("请输入第%s部手机的颜色:",i+1);
            String color=sc.next();
            p.setColor(color);
            arrTest[i]=p;
        }
        double average= Phone.getAverage(arrTest, arrTest.length);
        System.out.println(average);
    }
}
