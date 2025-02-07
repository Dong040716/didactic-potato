package exercises;

import java.util.Scanner;

public class exercise9 {
    //请编写程序，文本中”Java”一词出现的次数
    public static void main(String[] args) {
        //键盘输入字符
        Scanner sc=new Scanner(System.in);
        String inputText=sc.nextLine();
        StringBuilder sb = new StringBuilder(inputText);
        //指定的字符串
        String keyWord = "Java";
        //进行统计
        int count=0;
        while (true) {
            int index = sb.indexOf(keyWord);
            if (index != -1) { //存在指定的字符串
                count++;
                sb=new StringBuilder(sb.substring(index + keyWord.length()));//更新sb容器中的值
            } else {
                break; //不存在指定的字符串之后就退出循环
            }
        }
        System.out.println(count);
    }
}