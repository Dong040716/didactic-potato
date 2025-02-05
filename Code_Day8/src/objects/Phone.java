package objects;
public class Phone {

    //属性
    private String brand;
    private double price;

    //构造函数
    //空参构造方法
    public Phone(){}
    //带参数的构造方法
    public Phone(String brand,double price){
        this.brand=brand;
        this.price=price;
    }



    //外部接口
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public String getBrand(){
        return brand;
    }
    public double getPrice(){
        return price;
    }

    //行为
    public void call(){
        System.out.println("打电话");
    }
    public void playGame(){
        System.out.println("玩游戏");
    }
}