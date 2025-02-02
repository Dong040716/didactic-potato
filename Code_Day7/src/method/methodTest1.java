package method;

public class methodTest1 {
    public static void main(String[] args) {
        //设计一个方法，用于数组的遍历,要求遍历的结果在一行上
        //定义数组
        int []arr={11,22,33,44,55};
        //调用函数
        iterateArr(arr);
    }
    //定义函数
    public static void iterateArr(int []arr){
        for(int number:arr){
            System.out.print(number+" ");
        }
    }
}
