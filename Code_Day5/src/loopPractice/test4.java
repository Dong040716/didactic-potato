package loopPractice;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        //质数的判断
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入需要判断的数字:");
        int number= sc.nextInt();
        //先考虑1和2
        if(number==0||number==1){
            System.out.println(number+"不是质数");
        }
        else {
            //再判断大于2的自然数
            //如果 number 不是质数，那么它至少有一个因子小于或等于 Math.sqrt(number)。
            //循环条件
            for(int i=2;i<number;i++){
                if(number%i==0){
                    System.out.println(number+"不是质数");
                    return;
                }
            }
            //循环结束仍未退出函数则代表number不是指数5
            System.out.println(number+"是质数");
        }

    }
}
