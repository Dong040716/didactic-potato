package com.itheima;

import java.util.Scanner;

public class ifPractice3 {
    public static void main(String[] args) {
        //the third case of "if else"
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the grade of XiaoMIng");
        int grade = sc.nextInt();
        if (grade >= 0 && grade <= 100) {//Whether the numbers are valid or not
            if (grade <= 100 && grade >= 95) {
                System.out.println("Gift A");
            } else if (grade <= 94 && grade >= 90) {
                System.out.println("Gift B");
            } else if (grade <= 89 && grade >= 80) {
                System.out.println("Gift C");
            } else {
                System.out.println("No Gift!");
            }

        } else {
            System.out.println("Illegal Grades！");

        }
    }
}