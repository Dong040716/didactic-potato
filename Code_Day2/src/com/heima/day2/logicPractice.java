package com.heima.day2;

import java.util.Scanner;

public class logicPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 输入两个整数
        System.out.print("请输入第一个整数: ");
        int num1 = sc.nextInt();
        System.out.print("请输入第二个整数: ");
        int num2 = sc.nextInt();

        // 判断条件
        boolean result = (num1 == 6 || num2 == 6) || ((num1 + num2) % 6 == 0);

        // 输出结果
        System.out.println(result);

        // 关闭 Scanner
        sc.close();
    }
}
