package arrayList;

public class test1 {
    public static void main(String[] args) {
        //定义数组存储1 2 3 4 5
        int []arrayList={1,2,3,4,5};
        //遍历数组得到每一个元素，求数组中所有元素和
        int sum=0;//表示元素的和
        for (int i = 0; i < arrayList.length; i++) {
            System.out.println(arrayList[i]);
            sum=sum+arrayList[i];
        }
        System.out.println("数组的和是："+sum);
    }
}
