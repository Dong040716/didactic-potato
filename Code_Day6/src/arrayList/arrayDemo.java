package arrayList;

public class arrayDemo {
    public static void main(String[] args) {
        //数组的定义 (静态初始化)
        //简化格式：int []array={元素1,元素2};  int []arrayList=new int[10]; 不能同时定义数组的大小和初始化值
        //完整格式: int []array=new int []{元素1，元素2...}
        //定义数组，存储五个学生年龄
        int []stuAge={11,12,13,14,15};
        //存储三个学生姓名
        String []stuName={"Zhangsan","Lisi","Wangwu"};
        //存储四个学生的身高
        double []stuHeight={1.72,1.88,1.71,1.82};

        //数组的地址值和元素访问（利用循环遍历）
        for(int i=0;i<3;i++)
        {
            System.out.println(stuName[i]);
            System.out.println(stuAge[i]);
            System.out.println(stuHeight[i]);
            System.out.println('\n');
        }

    }
}
