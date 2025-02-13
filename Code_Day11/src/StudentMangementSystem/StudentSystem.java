package StudentMangementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void StartSystem() {
        Scanner sc = new Scanner(System.in);
        //创建一个集合，存储学生信息
        ArrayList<Student> students = new ArrayList<>();
        //主菜单界面
        while (true) {
            System.out.println("-------------学生管理系统----------------");
            System.out.println("1：添加学生信息");
            System.out.println("2：删除学生信息");
            System.out.println("3：修改学生信息");
            System.out.println("4：查询学生信息");
            System.out.println("0：退出管理系统");
            System.out.println("请输入您的选择:");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    return;
                case 1: {
                    //执行添加学生信息的函数
                    addStudent(students);
                    System.out.println("添加学生信息成功");
                    break;
                }
                case 2: {
                    //删除学生信息
                    deleteStudent(students);
                    break;
                }
                case 3: {
                    //修改学生信息
                    modifyStudent(students);
                    break;
                }
                case 4: {
                    //执行打印学生信息的函数
                    printfStudent(students);
                    break;
                }
                default: {
                    System.out.println("没有此选择，请重新输入选项!");
                }
            }
        }
    }

    //添加学生
    public static void addStudent(ArrayList<Student> students) {
        //首先需要判断集合是否为空，如果集合为空，则直接添加对象
        Scanner sc = new Scanner(System.in);
        if (students.isEmpty()) {
            System.out.println("请输入学生的id：");
            String stuId = sc.next();
            System.out.println("请输入学生的姓名：");
            String stuName = sc.next();
            System.out.println("请输入学生的年龄：");
            int stuAge = sc.nextInt();
            System.out.println("请输入学生的住址：");
            String stuAddress = sc.next();
            //把信息放入Student对象中
            Student stu = new Student(stuId, stuName, stuAge, stuAddress);
            //把stu对象放入集合中
            students.add(stu);
            // return 返回学生对象的集合
        }
        //集合不为空，则需要执行对id唯一性的判断
        else {
            while (true) {
                System.out.println("请输入学生的id：");
                String stuId = sc.next();
                if (!contains(students, stuId)) {
                    //Id信息不重复，可以添加其余信息
                    System.out.println("请输入学生的姓名：");
                    String stuName = sc.next();
                    System.out.println("请输入学生的年龄：");
                    int stuAge = sc.nextInt();
                    System.out.println("请输入学生的住址：");
                    String stuAddress = sc.next();
                    //把信息放入Student对象中
                    Student stu = new Student(stuId, stuName, stuAge, stuAddress);
                    //把stu对象放入集合中
                    students.add(stu);
                    break;
                } else {
                    System.out.println("已经存在此Id，请重新输入Id");
                }
            }

        }
    }

    //查询所有学生信息
    public static void printfStudent(ArrayList<Student> students) {
        //没有学生信息
        if (students.isEmpty()) {
            System.out.println("当前无学生信息，请添加后再查询");
        } else {
            //存在学生信息
            //打印表头
            System.out.println("id" + '\t' + "姓名" + '\t' + "年龄" + '\t' + "家庭住址");
            //逐行打印其余信息
            for (Student stu : students) {
                System.out.printf("%s" + '\t' + "%s" + '\t' + "%s" + '\t' + "%s" + '\n',
                        stu.getId(),
                        stu.getName(),
                        stu.getAge(),
                        stu.getAddress());
            }
        }
    }

    //删除学生信息
    public static void deleteStudent(ArrayList<Student> students) {
        //判断集合中的学生信息是否为空
        //集合中学生信息为空
        if (students.isEmpty()) {
            System.out.println("暂无学生信息存储，请添加学生信息后再使用此功能!");
        } else {
            //学生信息不为空
            //通过id来进行索引，删除对应的学生信息
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入要删除的学生Id信息:");
            String stuId = sc.next();
            //寻找是否有此Id的学生
            if (contains(students, stuId)) {
                //存在此Id的学生，则删除对应索引处的Student对象
                students.remove(returnIndex(students, stuId));
                System.out.println("对应学生信息已删除");
            } else {
                System.out.println("不存在对应Id的学生信息");
            }
        }
    }

    //修改学生信息
    public static void modifyStudent(ArrayList<Student> students) {
        //先判断集合是否为空
        if (students.isEmpty()) {
            System.out.println("暂无学生信息，请添加之后再使用此功能！");
        } else {
            //集合不为空，根据输入的Id信息来进行修改
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入需要修改的Id信息");
            String stuId = sc.next();
            if (contains(students, stuId)) {
                Student stu = students.get(returnIndex(students, stuId));
                //修改姓名
                System.out.println("请输入修改之后的学生姓名：");
                String stuName = sc.next();
                stu.setName(stuName);
                //修改年龄
                System.out.println("请输入修改之后的学生年龄：");
                int stuAge = sc.nextInt();
                stu.setAge(stuAge);
                //修改家庭住址
                System.out.println("请输入修改之后的学生住址：");
                String stuAddress = sc.next();
                stu.setAddress(stuAddress);
            } else {
                //return
                System.out.println("不存在此Id信息！");
            }

        }
    }

    //判断是否有对应Id信息的学生
    public static boolean contains(ArrayList<Student> students, String stuId) {
        //返回的索引不等于-1则代表有对应Id信息的学生
        return returnIndex(students, stuId) != -1;
    }

    //输入学生Id信息，返回在集合中对应的索引值
    public static int returnIndex(ArrayList<Student> students, String stuId) {
        for (int i = 0; i < students.size(); i++) {
            Student stu = students.get(i);
            if (stu.getId().equals(stuId)) {
                return i;
            }
        }
        //表示不存在此学生的Id信息
        return -1;
    }

}
