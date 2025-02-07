package exercises;

import java.util.Random;
import java.util.Scanner;
//键盘输入任意字符串，打乱里面的内容
public class exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符串");
        String s = sc.next();

        //创建一个字符数组，接受字符串的内容
        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        //随机索引数组，用于存储随机的索引值
        int[] randomIndexArr = new int[s.length()];

        //生成范围内所有索引值的随机排列
        Random r = new Random();
        //for循环，把随机索引值放入数组中
        int count = 0;//记录存储的索引值的个数
        while (count != randomIndexArr.length - 1) {
            int randomIndex = r.nextInt(0, s.length());
            if (!exist(randomIndexArr, randomIndex)) { //数组中不存在此索引
                randomIndexArr[count] = randomIndex;
                count++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            sb.append(chars[randomIndexArr[i]]);
        }
        String result = sb.toString();
        System.out.println(result);
    }

    //判断随机生成的索引值是否已经在随机索引数组中
    public static boolean exist(int[] randomIndexArr, int randomIndex) {
        for (int i = 0; i < randomIndexArr.length; i++) {
            if (randomIndexArr[i] == randomIndex) {
                return true;
            }
        }
        return false;
    }
}