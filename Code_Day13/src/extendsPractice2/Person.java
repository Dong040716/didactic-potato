package extendsPractice2;

public class Person {
    //内部成员
    private String name;
    private int age;

    //构造函数
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //get和set函数
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //内部函数
    public void keepPet(Animal animal, String something) {
        if (animal instanceof Dog d) {
            System.out.println(getName() + "养了一只狗");
            d.eat(something);
        } else if (animal instanceof Cat c) {
            System.out.println(getName() + "养了一只猫");
            c.eat(something);
        }
    }
}
