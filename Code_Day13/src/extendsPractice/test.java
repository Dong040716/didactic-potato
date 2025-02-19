package extendsPractice;

public class test {
    public static void main(String[] args) {
        Student s=new Student("zhangsan",21,"大三");
        Teacher t=new Teacher("lisi",40,"信息工程学院");
        s.behavior();
        s.fillForm();
        t.behavior();
        t.publishForm();
    }
}
