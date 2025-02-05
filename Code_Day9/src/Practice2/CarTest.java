package Practice2;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //创建一个数组用来存储汽车对象
        Car[] arr=new Car[3];
        //给汽车对象的属性赋值
        for (int i = 0; i < arr.length; i++) {
            //创建一个汽车对象
            Car c=new Car();
            System.out.printf("请输入第%s辆汽车的品牌:",i+1);
            String brand=sc.next();
            System.out.printf("请输入第%s辆汽车的价格:",i+1);
            double price=sc.nextDouble();
            System.out.printf("请输入第%s辆汽车的颜色:",i+1);
            String color=sc.next();
            //参数传入汽车对象
            arr[i]=c;
            c.setBrand(brand);
            c.setPrice(price);
            c.setColor(color);
        }
        //打印验证结果
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getBrand());
            System.out.println(arr[i].getPrice());
            System.out.println(arr[i].getColor());
            System.out.println();//使输出结果更加美观
        }
    }
}
