package extendsPractice2;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String age, String color) {
        super(age, color);
    }

    //内部函数
    @Override
    public void eat(String something) {
        System.out.println("狗在吃"+something);
    }

    public void lookHome() {
        System.out.println("狗在看家");
    }
}
