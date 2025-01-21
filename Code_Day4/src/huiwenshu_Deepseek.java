import java.util.Scanner;

public class huiwenshu_Deepseek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要判断的数字:");
        int number = sc.nextInt();
        int originNumber = number;  //存储原来的数字
        int reversedNumber = 0;     //存储翻转后的数字
        while (number > 0) {
            //记录翻转后的每一位数字
            reversedNumber = reversedNumber * 10 + number % 10;
            //更新number的数值
            number = number / 10;
        }
        if (originNumber == reversedNumber) {
            System.out.println("此数字是回文数");
        } else {
            System.out.println("此数字不是回文数");
        }

    }
}
