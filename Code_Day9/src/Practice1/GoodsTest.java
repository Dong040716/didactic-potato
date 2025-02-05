package Practice1;

public class GoodsTest {
    public static void main(String[] args) {
        //创建一个数组
        Goods[]arr=new Goods[3];
        //创建商品对象
        Goods g1=new Goods("001","华为p60",5999,100);
        Goods g2=new Goods("002","保温杯",227,50);
        Goods g3=new Goods("003","枸杞",12.7,70);
        //商品添加到数组中
        arr[0]=g1;
        arr[1]=g2;
        arr[2]=g3;
        //遍历验证结果
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getId());
            System.out.println(arr[i].getName());
            System.out.println(arr[i].getPrice());
            System.out.println(arr[i].getCount());
            System.out.println();
        }
    }
}
