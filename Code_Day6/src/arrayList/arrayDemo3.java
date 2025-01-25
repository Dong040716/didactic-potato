package arrayList;

public class arrayDemo3 {
    public static void main(String[] args) {
        //数组的动态初始化 初始化只指定长度，由系统为数组分配初始值
        //数组默认初始化值，
        //整数类型：默认为0
        //浮点数类型：默认为0.0
        //字符类型：默认为'\u0000'  -> 空格
        //Boolean类型：默认为false
        //引用数据类型，默认值为null

        //定义数组，存储50个学生的姓名
        String []stuName=new String[50];//默认值是Null
        stuName[0]="zhangsan";
        stuName[1]="lisi";
        System.out.println(stuName[0]);
    }
}
