package StringPractice;

public class StringPractice4 {
    public static void main(String[] args) {
        //输入身份证号码，提取其中关键信息
        //7-14位：出生的年月日
        //17位：性别，奇数男，偶数女
        String idNumber = "111222202502065666";
        //截取年月日信息
        String year = idNumber.substring(6, 10);
        String month = idNumber.substring(10, 12);
        String day = idNumber.substring(12, 14);
        System.out.println("人物信息为：");
        System.out.println("出生年月日："+year+"年"+month+"月"+day+"日");
        //截取性别信息，此时为char类型
        char gender = idNumber.charAt(16);
        //转换为int类型判断是男是女
        int number = gender - 48;
        if (number % 2 == 0) {
            System.out.println("性别为：女");
        } else {
            System.out.println("性别为：男");
        }
    }
}
