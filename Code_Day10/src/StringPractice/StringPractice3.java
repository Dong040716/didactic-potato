package StringPractice;

public class StringPractice3 {
    public static void main(String[] args) {
        //获取一个手机号码
        String phoneNumber="12345678900";
        //截取手机号码的前三位
        String firstThree=phoneNumber.substring(0,3);
        //截取手机号码的后四位
        String lastFour=phoneNumber.substring(7);
        //对手机号做屏蔽效果
        System.out.println(firstThree+"****"+lastFour);
    }
}
