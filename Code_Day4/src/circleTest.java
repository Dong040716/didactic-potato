import java.util.Scanner;

public class circleTest {
    public static void main(String[] args) {
        //录入两个数字表示范围，统计这个范围中，能被三整除也能被五整除的数字有几个
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数字表示范围:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = 0;//统计数字个数
        int[] array = new int[100];//用一个数组记录满足条件的数字是多少
        //分类讨论 不清楚两个数字的大小
        if (num1 >= num2)         //可以用max，min函数来求两个边界值哪个大哪个小
        {
            for (int i = num2; i <= num1; i++) {
                if (i % 3 == 0 && i % 5 == 0) {//满足条件时，数组记录数字
                    array[sum] = i;
                    sum++;
                }
            }
        } else {
            for (int i = num1; i <= num2; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    array[sum] = i;
                    sum++;
                }
            }
        }
        //打印输出结果
        System.out.println("总共有"+sum+"个数字满足条件");
        System.out.println("这些数字分别为:");
        for (int j = 0; j < sum; j++) {
            System.out.println(array[j]);
        }
    }
}
