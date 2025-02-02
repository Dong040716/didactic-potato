package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        //定义一个数组，存储六个评委的打分
        double[] scores = new double[6];
        Scanner sc = new Scanner(System.in);
        //输入评分
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的评分");
            while (true) {
                if (sc.hasNextDouble()) {//判断输入的是否为合法的double类型的数据
                    double score=sc.nextDouble();
                    if (score <= 100 && score >= 0) {//合法范围的数字
                        scores[i] = score;
                        break;//跳出本次循环，
                    } else {
                        System.out.println("评分必须在0-100之间，请重新输入!");
                    }
                } else {//非法的数据输入
                    System.out.println("输入无效，请输入一个0~100中的数字!");
                    //清除非法输入
                    sc.next();
                }
            }
        }
        //对数组进行排序
        Arrays.sort(scores);

        double totalScore = 0;//总成绩
        int validScoresCount = 0;//用来记录一共几个成绩
        for (int i = 0; i < scores.length; i++) {
            if (i != 0 && i != scores.length - 1) {
                totalScore = totalScore + scores[i];
                validScoresCount++;
            }
        }
        double averageScore = totalScore / validScoresCount;
        System.out.println("平均成绩为：" + averageScore);

    }
}
