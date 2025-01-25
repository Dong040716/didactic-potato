package arrayList;

public class test3 {
    public static void main(String[] args) {
        //给数组中的元素赋值1-10
        int []arr={1,2,3,4,5,6,7,8,9,10};

        for (int j = 0; j < arr.length; j++) {
            //换成if else语句则不需要在第一个if中添加continue语句
            if(arr[j]%2==0){ //偶数
                arr[j]=arr[j]/2; //变为原来的一半
                //变为奇数之后不应该再重复判断，因此开始下次循环
                continue;
            }
            if (arr[j]%2==1){ //奇数
                arr[j]=arr[j]*2; //变为原来的2倍
            }
        }
        //打印结果，验证代码正确性
        for (int m = 0; m < arr.length; m++) {
            System.out.println(arr[m]);
        }
    }
}
