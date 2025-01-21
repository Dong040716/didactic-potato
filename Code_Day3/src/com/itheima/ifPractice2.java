package com.itheima;

import java.util.Scanner;

public class ifPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的座位号");
        int seatNumber = sc.nextInt();
        if (seatNumber >= 0 && seatNumber <= 100) {
            if (seatNumber % 2 == 0) {
                System.out.println("坐在右边");
            } else {
                System.out.println("坐在左边");
            }

        }
        System.out.println("不存在此座位号");
    }
}
