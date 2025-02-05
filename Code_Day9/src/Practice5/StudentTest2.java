package Practice5;

import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class StudentTest2 {
    public static void main(String[] args) {
        //创建对象
        Student s1 = new Student(1, "dongxin", 21);
        Student s2 = new Student(2, "skiy", 21);
        Student s3 = new Student(3, "chaoyu", 21);
        //创建一个存放对象的数组
        Student[] arrStudent = new Student[3];
        //给数组赋值
        arrStudent[0] = s1;
        arrStudent[1] = s2;
        arrStudent[2] = s3;
        //调用删除学生信息的函数
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入要删除的学生的学号：");
        int stuNo=sc.nextInt();
        Student[] testArr=deleteStudent(arrStudent,stuNo);
        //调用打印数组信息函数
        printStudentInfo(testArr);
        //验证selectAndAddAge函数
        selectAndAddAge(testArr,1);
        printStudentInfo(testArr);

    }

    //通过id删除学生信息
    public static Student[] deleteStudent(Student[] arr, int stuNo) {
        //记录是否存在对应学号的学生
        boolean contain = false;
        //如果对应学生存在则记录学生信息的索引
        int index = 0;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getStuNo() == stuNo) {
                contain = true;
                index = i;
                //找到之后退出循环
                break;
            }
        }
        //如果有相应学号的学生
        if (contain) {
            //创建一个新的数组，替换掉原来的数组即可
            Student[] newArr = new Student[arr.length - 1];
            for (int j = 0, n = 0; j < arr.length; j++) {
                if (j != index) { //原位置的数组元素直接进行舍弃
                    newArr[n]=arr[j]; //直接把原来数组的元素地址值赋给新的数组元素
                    n++;
                }
            }
            return newArr;
        } else {
            System.out.println("没有对应学号的学生！");
            return arr;
        }

    }
    //遍历数组
    public static void printStudentInfo(Student[] arr){
        for (Student student : arr) {
            System.out.println(student.getStuNo());
            System.out.println(student.getStuName());
            System.out.println(student.getStuAge());
        }
    }

    //查询id为特定值的学生，如果有的话，则将年龄加一岁
    public static void selectAndAddAge(Student[] arr,int stuNo){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getStuNo()==stuNo){
                arr[i].setStuAge(arr[i].getStuAge()+1);//年龄加一岁
            }
        }
    }

}
