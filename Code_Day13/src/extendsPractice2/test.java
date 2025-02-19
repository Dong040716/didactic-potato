package extendsPractice2;

public class test {
    public static void main(String[] args) {
        Person person = new Person("张三", 31);
        Dog d = new Dog();
        Cat c = new Cat();
        person.keepPet(d,"骨头");
        person.keepPet(c,"猫粮");

    }
}
