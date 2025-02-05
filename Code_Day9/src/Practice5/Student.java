package Practice5;

public class Student {
    //属性
    private int stuNo;//学号
    private String stuName;//姓名
    private int stuAge;//年龄

    //构造函数
    public Student() {
    }

    public Student(int stuNo, String stuName, int stuAge) {
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.stuAge = stuAge;
    }

    //get函数
    public int getStuNo() {
        return stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    //set函数
    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    //判断学号是否为唯一性
    public static boolean contains(Student[] arr, int stuNo) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getStuNo()==stuNo) {
                return true;
            }
        }
        return false;
    }
}
