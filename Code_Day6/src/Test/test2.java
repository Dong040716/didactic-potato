package Test;

import java.util.Random;
//生成10个 1~100之间的随机数随机存入数组
//求出所有数据的和，平均数
//统计有多少数据比平均数小
//生成random对象

public class test2 {
    public static void main(String[] args) {
        Random random = new Random();
        //生成数组(大小为10),用于接收随机数的值
        int[] arr = new int[10];
        //数组接受10个随机数的数值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 101);
        }
        //打印输出10个随机数
        for (int j = 0; j < arr.length; j++) {
            System.out.println("第" + (j + 1) + "个随机数的值为:" + arr[j]);
        }
        //定义平均数,和,计数器
        double average = 0;
        double sum = 0;
        int count = 0;

        //for-each循环求和
        for (int num : arr) {
            sum = sum + num;
        }
        //打印10个数的和
        System.out.println("十个随机数的和为:" + sum);
        //求平均值
        average = sum / arr.length;
        System.out.println("十个随机数的平均值为:" + average);

        //for-each循环求小于平均数的元素个数
        for (int num : arr) {
            if(num<average){
                count++;
            }
        }

        System.out.println("有" + count + "个随机数比平均值小");

    }
}
