package com.heima.demo1;
import java.sql.SQLOutput;
import java.util.Scanner;


public class HelloWorld {
    public static void main(String[] args) {
        String name="黑马谢广坤";
        int age=18;
        char sex='男';
        float height=180.1F;
        Boolean Status=true;
        System.out.println("姓名:"+name);//字符串拼接
        System.out.println("年龄:"+age);
        System.out.println("性别:"+sex);
        System.out.println("身高:"+height);
        System.out.println("是否单身:"+(Status ? "是" : "否"));

        //java的键盘录入,录入两个数的合并且打印
        Scanner num1=new Scanner(System.in);
        Scanner num2=new Scanner(System.in);
        System.out.print("请输入第一个数字：");
        int m=num1.nextInt();
        System.out.print("请输入第二个数字：");
        int n=num2.nextInt();
        System.out.print("两个数字和为："+(m+n));
    }
}

