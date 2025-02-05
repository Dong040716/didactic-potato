package Stringdemo;

import java.util.Scanner;

public class StringDemo4 {
    //定义一个方法，实现字符串的反转
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String string = sc.next();
        //调用方法实现字符串的反转
        String reverseStr = reverseString(string);
        System.out.println(reverseStr);
    }

    public static String reverseString(String s) {
        //定义一个空的字符串变量
        String tempString = "";
        //先定义一个字符数组接受字符串变量
        char[] tempArr = new char[s.length()];
        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = s.charAt(i);
        }
        //在字符数组中进行换位置的操作
        for (int left = 0, right = s.length() - 1; left < right; left++, right--) {
            char temp = tempArr[left];
            tempArr[left] = tempArr[right];
            tempArr[right] = temp;
        }
        //遍历新的字符串数组，拼接到新的字符串
        for (int i = 0; i < tempArr.length; i++) {
            tempString = tempString + tempArr[i];
        }
        return tempString;
    }
}
