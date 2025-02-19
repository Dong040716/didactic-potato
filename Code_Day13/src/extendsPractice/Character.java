package extendsPractice;

public class Character {
    //定义角色类作为父类包含属性（名称，年龄），行为（查看课表）
    private String name;
    private int age;

    public Character() {
    }
    public Character(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //行为
    public void behavior(){
        System.out.println("查看课表");
    }
}
