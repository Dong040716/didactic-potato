package arrayList;

public class test2 {
    public static void main(String[] args) {
        //给数组中的元素赋值1-10
        int []arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
        }
        int count=0;//统计变量count
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]%3==0){
                System.out.println(arr[j]);//打印出此数字
                count++;//更新计数器
            }
        }
        System.out.println("能被3整除的数字一共有："+count+"个");

    }
}
