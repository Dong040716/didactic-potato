package extendsPractice;

public class Teacher extends Character{
    private String department;

    public Teacher(String department) {
        this.department = department;
    }

    public Teacher(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    //内部函数
    public void publishForm(){
        System.out.println("发布问题");
    }
}
