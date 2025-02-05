package Practice3;

public class Phone {
    //手机的属性
    private String brand;
    private double price;
    private String color;

    //构造函数
    public Phone() {
    }

    public Phone(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    //get函数
    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    //set函数
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //成员函数

    //求三部手机平均值,设置为全局函数
    public static double getAverage(Phone[] arr,int number){
        //设置变量：总价格
        double sum=0;
        //遍历数组,依次读取每部手机的价格
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i].getPrice();
        }
        double average=sum/number;
        return average;
    }

}
