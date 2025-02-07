package exercises;

import java.util.Scanner;

public class exercise9Ex {
    //exercise9的另一种方法
    public static void main(String[] args) {
        //键盘输入字符
        Scanner sc = new Scanner(System.in);
        String inputText = sc.nextLine();

        //指定的字符串
        String keyWord = "Java";
        //count变量进行统计
        int count = 0;
        //fromIndex变量用来记录开始检索的起始地址
        int fromIndex = 0;
        while (true) {
            int index = inputText.indexOf(keyWord, fromIndex);
            if (index != -1) { //存在指定的字符串
                count++;
                fromIndex = index + keyWord.length(); //更新fromIndex的值，起始量＋偏移量
            } else {
                break; //不存在指定的字符串之后就退出循环
            }
        }
        System.out.println(count);
    }
}
