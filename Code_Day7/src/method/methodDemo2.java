package method;

public class methodDemo2 {
    public static void main(String[] args) {
        //定义一个函数,求圆的面积,打印结果
        //调用函数
        getArea(1.5);

    }

    //定义求面积的函数
    public static void getArea(double r){
        double Area=r*r*3.14;
        System.out.println("圆的面积为:");
        System.out.println(Area);
    }
}
