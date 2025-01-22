package loopPractice;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        //平方根
        //接受数字
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要计算的数字：");
        int number= sc.nextInt();
        for(int i=0;i<=number;i++){
            if(i*i==number){
                System.out.println(i+"就是"+number+"的平方根");
                break;
            }
            else if(i*i>number){
                System.out.println((i-1)+"就是"+number+"的平方根的整数部分");
                break;
            }
        }
    }
}
