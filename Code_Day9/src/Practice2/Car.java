package Practice2;

public class Car {
    //属性
    private String brand;
    private double price;
    private String color;

    //构造函数
    public Car(){}
    public Car(String brand,double price,String color){
        this.brand=brand;
        this.price=price;
        this.color=color;
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
}
