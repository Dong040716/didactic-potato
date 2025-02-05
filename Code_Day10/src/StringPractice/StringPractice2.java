package StringPractice;

import java.util.Scanner;
import java.util.SplittableRandom;

public class StringPractice2 {
    public static void main(String[] args) {
        //金额转换，输入一串整数，输出大写的汉字数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入金额");
        int cost = 0;
        while (true) {//定义一个循环，只有输入的值在规定范围内，才能执行下一步操作
            cost = sc.nextInt();
            if (cost >= 0 && cost <= 9999999) {
                break;//跳出循环
            }
            System.out.println("不支持的金额数，请重新输入金额");
        }
        //先提取出每一位数字来，转换成大写数字，拼接到一起
        String s = "";
        String result = "";
        while (cost > 0) {
            int ge = cost % 10;
            s = smallToBig(ge) + s; //拼接为一个大写数字的字符串
            cost = cost / 10;
        }
        //给大写数字的高位补零
        for (int i = 7 - s.length(); i > 0; i--) {
            s = "零" + s;
        }
        //给大写的数字补齐单位
        String[] unit = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        for (int i = 0; i < unit.length; i++) {
            char a = s.charAt(i);
            result = result + a + unit[i];
        }
        System.out.println(result);
    }

    //小写数字转成大写数字
    public static String smallToBig(int number) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[number];
    }
}
