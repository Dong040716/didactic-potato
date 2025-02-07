package exercises;

import java.util.Scanner;

public class exercise6 {
    //定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。
    public static void main(String[] args) {
        System.out.println("请输入一串字符串");
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        //调用方法
        boolean result = symmetry(inputStr);
        System.out.println(result);
    }

    //定义一个方法，判断是否对称
    public static boolean symmetry(String inputStr) {
        //处理空指针和空字符串
        if (inputStr == null || inputStr.isBlank())
            return false;
        else
            //链接式
            return new StringBuilder(inputStr).reverse().toString().equals(inputStr);
    }
}
