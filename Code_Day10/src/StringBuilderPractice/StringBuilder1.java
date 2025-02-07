package StringBuilderPractice;

import java.util.Scanner;

public class StringBuilder1 {
    public static void main(String[] args) {
        //键盘接受一个字符串，程序判断该字符串是不是对称字符，并在打印台打印是或者不是
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要判断的字符串");
        String s = sc.next();
        //调用判断方法
        ifSymmetry(s);
    }

    public static void ifSymmetry(String s) {
        //SB类型接受字符串
        StringBuilder sb = new StringBuilder(s);
        //接受翻转后的字符串
        String reverseStr = sb.reverse().toString();
        if (s.equals(reverseStr)) {
            System.out.println("是对称字符");
        } else {
            System.out.println("不是对称字符");
        }
    }

}
