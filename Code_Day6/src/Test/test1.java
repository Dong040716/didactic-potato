package Test;

public class test1 {
    public static void main(String[] args) {
        //求数组的最大值
        //定义数组
        int []arr={33,5,22,44,55};
        //定义变量max存储最大值

        //max初始化中的值必须为数组中的值
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        //打印输出最大值
        System.out.println(max);

    }
}
