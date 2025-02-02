package method;

public class methodTest2 {
    public static void main(String[] args) {
        //设计方法求一个数组的最大值,并且将最大值返回
        //定义数组
        int []arr={-11,-22,33,44,-55};
        //调用方法
        int max=getMax(arr);
        System.out.println("最大值为:");
        System.out.println(max);
    }
    //定义方法
    public static int getMax(int []arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

}
