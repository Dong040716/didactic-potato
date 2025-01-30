package Assignments;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        //有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。
        // 再通过键盘录入一个整数数字。
        // 要求：把数字放入数组序列中，生成一个新的数组，并且数组的元素依旧是从小到大排列的。

        //定义一个数组
        int[] arr = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        System.out.println("请输入一个整数数字:");
        //定义变量接收整数
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //定义一个新的数组,长度为原来数组的长度+1
        int[] newArr = new int[arr.length + 1];
        //位置变量
        int location = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num < arr[i]) {
                //记录插入的位置
                location = i;
                break;
            }
            //比其他数字都大
                location = i + 1;
        }
        // 填充新数组
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == location) {
                newArr[i] = num;  //插入新元素
            } else {
                //复制原来的数组,只有执行这个操作之后，j的值才会增加
                newArr[i] = arr[j];
                j++;
            }
        }
        //输出新的数组
        System.out.println("新的数组为:");
        for (int numbers : newArr) {
            System.out.print(" "+numbers);
        }
    }
}
