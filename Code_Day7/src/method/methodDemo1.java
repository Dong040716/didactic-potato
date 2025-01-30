package method;

import java.util.Scanner;

public class methodDemo1 {
    public static void main(String[] args) {
        //定义一个方法，求长方形的周长,打印结果
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入长方形的长度：");
        int length=sc.nextInt();
        System.out.println("请输入长方形的宽度：");
        int width=sc.nextInt();
        getC(length,width);
    }
    //定义函数
    public static void getC(int length, int width) {
        int circumference=(length+width)*2;
        System.out.print("长方形的周长为：");
        System.out.print(circumference);
    }
}

