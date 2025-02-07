package exercises;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        //键盘录入字符串，把内容变成罗马数字
        String numbers;
        Scanner sc = new Scanner(System.in);
        //输入检验
        while (true) {
            System.out.println("请输入一串数字：");
            String s = sc.next();
            //字符串遍历数组
            int count = 0;   //count变量用来检测是否有字母
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) <= 57 && s.charAt(i) >= 48) {
                    continue;
                } else {
                    count++;//有字母出现
                }
            }
            int length = s.length();
            if (length > 9) {
                //先检验长度是否小于9
                System.out.println("字符串的长度必须小于等于9!");
            } else if (count != 0) {
                //再检验字符串中是否全部为数字
                System.out.println("字符串中必须全部为数字!");
            } else {
                //通过检验之后跳出循环
                numbers = s;
                break;
            }
        }
        //新建一个StringBuilder类
        StringBuilder sb = new StringBuilder();
        //遍历原字符串数组
        for (int i = 0; i < numbers.length(); i++) {
            //临时字符变量存储字符串数组中的元素
            char temp = numbers.charAt(i);
            //替换为罗马数字
            if (temp == 48) {
                sb.append(" ").append(",");
            } else if (temp == 49) {
                sb.append("I").append(",");
            } else if (temp == 50) {
                sb.append("II").append(",");
            } else if (temp == 51) {
                sb.append("III").append(",");
            } else if (temp == 52) {
                sb.append("IV").append(",");
            } else if (temp == 53) {
                sb.append("V").append(",");
            } else if (temp == 54) {
                sb.append("VI").append(",");
            } else if (temp == 55) {
                sb.append("VII").append(",");
            } else if (temp == 56) {
                sb.append("VIII").append(",");
            } else if (temp == 57) {
                sb.append("IX").append(",");
            }
        }
        sb.deleteCharAt(sb.length() - 1);//删除多余的逗号
        String result = sb.toString();
        System.out.println(result);
    }
}
