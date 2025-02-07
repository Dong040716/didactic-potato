package exercises;

import java.util.Scanner;

public class exercise7 {
    //检验身份证号码是否合法
    //号码为18位，不能以数字0开头，前17位只可以是数字，最后一位可以是数字或者大写字母X
    public static void main(String[] args) {
        System.out.println("请输入身份证号码进行判断");
        Scanner sc = new Scanner(System.in);
        String inputIdNumber = sc.nextLine();
        //调用方法进行判断
        System.out.println(valid(inputIdNumber));
    }

    //检验身份证号码是否合法的方法
    public static boolean valid(String inputIdNumber) {
        //先判断是否为18位数字
        if (inputIdNumber.length() == 18) {
            //判断是否以数字零开头
            char firstNumber = inputIdNumber.charAt(0);
            if (firstNumber == '0') {
                return false;
            }
            //判断完第一位数字，再判断前十七位是否为数字
            for (int i = 0; i < inputIdNumber.length() - 1; i++) {
                char temp = inputIdNumber.charAt(i);
                if (!(temp <= '9' && temp >= '0')) {
                    return false;
                }
            }
            //最后判断最后一位，可以是数字，也可以是大写字母X
            char lastNumber = inputIdNumber.charAt(inputIdNumber.length() - 1);
            return (lastNumber <= '9' && lastNumber >= '0') || (lastNumber == 'X');
        } else return false;
    }

}
