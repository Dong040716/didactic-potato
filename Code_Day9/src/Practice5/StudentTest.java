package Practice5;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        //大小为3的数组，存储学生对象
        Student[] stuArr=new Student[3];
        //数组初始化
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        stuArr[0]=s1;
        stuArr[1]=s2;
        stuArr[2]=s3;
        //添加学生对象的数据，根据学号的唯一性进行是否添加的判断标准
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < stuArr.length; i++) { //每次输入序号时进行判断
            int stuNo;
            //使用一个无限循环，只有学号不存在时，才会执行之后的输入操作
            while (true){
                System.out.println("请输入第"+(i+1)+"个学生的学号：");
                //先判断输入的学号是否存在于数组中
                stuNo=sc.nextInt();
                if (!Student.contains(stuArr,stuNo)){
                    stuArr[i].setStuNo(stuNo);
                    break;//不重复的学号->则跳出本次循环，继续执行输入操作
                }
                else {//重复的学号->提示输入的学号重复，请再次输入
                    System.out.println("输入了重复的学号，请再次输入");
                }
            }
            //当学号不重复时，才能输入其他的数据
            System.out.println("请输入第"+(i+1)+"个学生的姓名：");
            stuArr[i].setStuName(sc.next());
            System.out.println("请输入第"+(i+1)+"个学生的年龄：");
            stuArr[i].setStuAge(sc.nextInt());
        }
        //遍历所有学生信息
        for (Student student : stuArr) {
            System.out.println(student.getStuNo());
            System.out.println(student.getStuName());
            System.out.println(student.getStuAge());
        }
        //通过id删除学生信息

    }
}
