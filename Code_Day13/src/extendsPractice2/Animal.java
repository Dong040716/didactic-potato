package extendsPractice2;

public class Animal {
    //属性
    private String age;
    private String color;

    //构造函数
    public Animal() {
    }

    public Animal(String age, String color) {
        this.age = age;
        this.color = color;
    }
    //get和set函数

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //内部函数
    public void eat(String something) {
        System.out.println("此动物在吃" + something);
    }

}
