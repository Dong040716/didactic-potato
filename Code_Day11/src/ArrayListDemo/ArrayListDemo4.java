package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo4 {
    //定义一个集合添加一些学生对象，进行遍历
    public static void main(String[] args) {
        ArrayList<Student> studArrayList = new ArrayList<>();
        Student s1 = new Student("stu1", 20);
        Student s2 = new Student("stu2", 21);
        Student s3 = new Student("stu3", 22);

        studArrayList.add(s1);
        studArrayList.add(s2);
        studArrayList.add(s3);

        for (int i = 0; i < studArrayList.size(); i++) {
            //获取集合中每个对象
            Student stu = studArrayList.get(i);
            System.out.println(stu.getName());
        }
    }
}
