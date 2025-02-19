package extendsPractice;

public class Student extends Character{
    private String Class;

    public Student(String aClass) {
        Class = aClass;
    }

    public Student(String name, int age, String aClass) {
        super(name, age);
        Class = aClass;
    }
    public void fillForm(){
        System.out.println("填写听课反馈");
    }
}
