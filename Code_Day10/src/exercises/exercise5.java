package exercises;

import java.util.Scanner;

public class exercise5 {
    //键盘录入字符串，统计字符串中英文字母和数字分别有多少个
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符串：");
        String str = sc.next();
        int letterNumber = 0;//字母数量
        int digitNumber = 0;//数字数量
        for (int i = 0; i < str.length(); i++) {
            //临时的字符temp来接收字符串中的每个字符
            char temp = str.charAt(i);
            if (temp <= 'z' && temp >= 'a' || temp <= 'Z' && temp >= 'A') {
                letterNumber++;
            } else if (temp <= '9' && temp >= '0') {
                digitNumber++;
            }
        }
        System.out.println(letterNumber);
        System.out.println(digitNumber);
    }
}
