package Stringdemo;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        //键盘录入一个字符串，统计字符串中大写字母，小写字母，数字出现的个数（不考虑其他的字符）

        //接受用户输入的字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一行字符串：");
        String s = sc.next();
        //定义计数器变量
        int uppercaseLetterCount = 0;
        int lowercaseLetterCount = 0;
        int numberCount = 0;
        int otherCount=0;
        //遍历字符串，统计其中各个字符的数量
        for (int i = 0; i < s.length(); i++) {
            //定义临时变量接受字符串的各个字符
            char temp = s.charAt(i);
            if (temp <= 'z' && temp >= 'a') {
                lowercaseLetterCount++;
            } else if (temp <= 'Z' && temp >= 'A') {
                uppercaseLetterCount++;
            } else if (temp <= '9' && temp >= '0') {
                numberCount++;
            }
            else {
                otherCount++;
            }
        }
        //打印输出结果
        System.out.printf("小写字母有%s个", lowercaseLetterCount);
        System.out.println();
        System.out.printf("大写字母有%s个", uppercaseLetterCount);
        System.out.println();
        System.out.printf("数字有%s个", numberCount);
        System.out.println();
        System.out.printf("其余字符有%s个", otherCount);
        System.out.println();
    }
}
