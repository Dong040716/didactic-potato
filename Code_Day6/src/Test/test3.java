package Test;

public class test3 {
    public static void main(String[] args) {
        //定义一个数组1 2 3 4 5，首尾数据进行交换
        //定义数组
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //循环结束，实现首尾交换
        //验证
        for(int number:arr){
            System.out.print(number);
        }
        
    }
}
