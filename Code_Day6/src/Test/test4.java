package Test;

import java.util.Random;

public class test4 {
    public static void main(String[] args) {
        //定义一个数组，存入1~5，要求打乱数组中的数据
        //定义数组
        int[] arr = {1, 2, 3, 4, 5};
        //产生随机数
        Random r = new Random();
        //循环遍历
        for (int i=0;i< arr.length;i++){
            //每次循环都接收随机数生成的索引
            int randomIndex=r.nextInt(0, arr.length);
            //交换
            int temp=arr[i];
            arr[i]=arr[randomIndex];
            arr[randomIndex]=temp;
        }
        //输出结果并验证结果
        for(int number:arr){
            System.out.print(number+" ");
        }
    }
}
