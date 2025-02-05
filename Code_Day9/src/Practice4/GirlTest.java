package Practice4;

public class GirlTest {
    public static void main(String[] args) {
        //定义数组存储girl对象
        Girl[] arr=new Girl[4];
        //定义Girl对象
        Girl g1=new Girl("name1",18,"女","打篮球");
        Girl g2=new Girl("name2",20,"女","打羽毛球");
        Girl g3=new Girl("name3",23,"女","打排球");
        Girl g4=new Girl("name4",28,"女","打乒乓球");
        //把Girl对象的地址值赋值给数组
        arr[0]=g1;
        arr[1]=g2;
        arr[2]=g3;
        arr[3]=g4;
        //定义ave，sum变量
        double average=0;
        double sum=0;
        //计算平均年龄
        Girl g=new Girl();
        for (int i = 0; i < arr.length; i++) {
            g=arr[i];
            sum=sum+g.getAge();
        }
        average=sum/arr.length;
        System.out.println("平均值为："+average);
        //统计年龄比平均值低的Girl对象的个数，打印其全部信息
        int countUnderAve=0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j].getAge()<average){
                countUnderAve++;
                System.out.println(arr[j].getName());
                System.out.println(arr[j].getAge());
                System.out.println(arr[j].getGender());
                System.out.println(arr[j].getHobby());
            }
        }
        System.out.println(countUnderAve);
    }
}
