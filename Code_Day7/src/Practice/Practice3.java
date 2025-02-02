package Practice;

import java.util.Random;

// 定义方法实现随机产生一个5位的验证码
//长度为5
// 前四位是大写字母或者小写字母
// 最后一位是数字

public class Practice3 {
    public static void main(String[] args) {

        //把数据都放入数组中
        //产生随机的索引，从而生成随机的验证码
        //大小写字母放入数组中,共52个
        char[] arrLetter = new char[52];
        for (int i = 0; i < arrLetter.length; i++) {
            if (i <= 25) {//添加小写字符
                arrLetter[i] = (char) (97 + i);//强制类型转换
            } else {     //添加大写的字符
                arrLetter[i] = (char) (65 + i - 26);
            }
        }
        String result="";//定义一个空的字符串变量
        //产生一个随机数
        Random r = new Random();
        int randomNumber = r.nextInt(0, 10);
        for (int j = 0; j < 4; j++) {//执行四次产生随机索引的操作,后续可以更改j变量的值,定义一个宏的常量
            int randomIndex = r.nextInt(0, arrLetter.length);//范围为0~51
            result=result+arrLetter[randomIndex];//字符串进行拼接
        }
        result=result+randomNumber;
        System.out.print("系统产生的随机验证码为: ");
        System.out.println(result);

    }
}
