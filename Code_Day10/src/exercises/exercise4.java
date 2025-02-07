package exercises;

import java.util.Random;

public class exercise4 {
    //生成验证码，可以是大小写字母也可以是数字，长度为5，数字只有一位，但是可以出现在任意的位置
    public static void main(String[] args) {
        //先生成一个随机的字母序列

        //定义一个数组存储大小写字母，大小为52
        char[] arr = new char[52];
        char start = 'a';
        char upperStart = 'A';
        //字符数组中先放入大小写字母
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = start++;//存放小写字母
            arr[i + 26] = upperStart++;//存放大写字母
        }
        //再把大小写字母放入sb容器中进行拼接
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(0, arr.length);
            sb.append(arr[randomIndex]);
        }
        //生成一个随机数字
        int randomNumber = r.nextInt(0, 10);
        //生成的随机数插入随机的位置
        int randomIndexOfNumber = r.nextInt(0, 5);//范围是0-4（索引值）
        sb.insert(randomIndexOfNumber, randomNumber);
        String result = sb.toString();
        System.out.println(result);
    }
}
