package ArrayListPractice;

public class Phone {
    //属性
    private String brand;
    private double price;

    //构造方法
    public Phone() {
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    //get函数
    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    //set函数
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
