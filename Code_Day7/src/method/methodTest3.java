package method;

import java.util.Scanner;

public class methodTest3 {
    public static void main(String[] args) {
        //定义一个方法判断数组中的某一数据是否存在,把结果返回给调用处
        //定义数组
        int []arr={1,5,8,12,56,44,64,75,90};
        //定义Scanner
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入需要判断的数据:");
        int receiveNumber=sc.nextInt();
        boolean exist=existJudgement(arr,receiveNumber);
        if(exist){
            System.out.println("存在此数组中");
        }
        else {
            System.out.println("不存在此数组中");
        }
    }
    //定义方法
    public static boolean existJudgement(int []arr,int judgeNumber){
        for (int i = 0; i < arr.length; i++) {
            if(judgeNumber==arr[i]){
                return true;//return代表方法的结束，break只是会结束循环
            }
        }
        return false;
    }

}
