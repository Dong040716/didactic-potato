package extendsPractice2;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String age, String color) {
        super(age, color);
    }

    //内部函数
    @Override
    public void eat(String something) {
        System.out.println("猫在吃" + something);
    }

    public void catchMouse() {
        System.out.println("猫在捉老鼠");
    }
}
