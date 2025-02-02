package Practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class twoColorBall {
    public static void main(String[] args) {
        //双色球彩票系统,两个功能
        //1.生成中奖号码
        //2.用户输入号码，判断是否中奖
        int[] prizeNumberArr = {1, 3, 11, 15, 20, 33, 6};
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.生成双色球号码");
            System.out.println("2.判断是否中奖");
            System.out.print("请选择上述功能: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    int[] generateArr = createNumber();
                    for (int i = 0; i < generateArr.length; i++) {
                        System.out.print(generateArr[i] + " ");
                    }
                    System.out.println();
                    break;
                }
                case 2: {
                    inputNumber(prizeNumberArr);
                    break;
                }
                default: {
                    return;
                }
            }
        }
    }

    //生成中奖号码
    public static int[] createNumber() {
        //创建一个数组，用来存储中奖号码，六个红球，一个蓝球
        int[] arrRed = new int[6];
        Random r = new Random();
        //产生红球的号码
        for (int i = 0; i < arrRed.length; ) {
            int redNumber = r.nextInt(1, 34);
            //调用方法，判断此随机数是否存在数组中
            if (!contains(arrRed, redNumber)) {//不包含在数组中
                arrRed[i] = redNumber;
                i++;//数组长度加一
            }
        }//红色球的号码进行排序
        Arrays.sort(arrRed);
        //定义一个存储红色和蓝色球的数组
        int[] finalArr = new int[7];
        //对新数组前六个红球进行赋值
        for (int i = 0; i < arrRed.length; i++) {
            finalArr[i] = arrRed[i];
        }
        //对新数组最后的一个蓝球赋值
        //产生蓝色球的号码
        finalArr[finalArr.length - 1] = r.nextInt(1, 17);
        return finalArr;

    }

    //判断中奖号码是否已经包含在了数组中
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }

    //手动输入号码判断是否中奖(中的是什么奖项)
    public static void inputNumber(int[] winningArr) {
        Scanner sc = new Scanner(System.in);
        //定义一个数组
        int[] arr = new int[7];
        System.out.println("请用户输入号码:");
        //用户输入自己所获得的号码
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //定义两个变量来表示两种颜色的球有几个号码相同
        int countRed = 0;
        int countBlue = 0;
        //红色球中了几个
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == winningArr[i]) {
                countRed++;
            }
        }
        //蓝色球是否中了
        if (arr[arr.length - 1] == winningArr[winningArr.length - 1]) {
            countBlue++;
        }

        if (countRed == 6 && countBlue == 1) {
            System.out.println("恭喜您中了最高大奖一等奖——1000万!");
        } else if (countRed == 6 && countBlue == 0) {
            System.out.println("恭喜您中了大奖二等奖——500万!");
        } else if (countRed == 5 && countBlue == 1) {
            System.out.println("三等奖 3000元");
        } else if (countRed == 5 && countBlue == 0 || countRed == 4 && countBlue == 1) {
            System.out.println("四等奖 200元");
        } else if (countRed == 4 && countBlue == 0 || countRed == 3 && countBlue == 1 || countRed == 2 && countBlue == 1) {
            System.out.println("五等奖 10元");
        } else if (countRed==1&&countBlue==1||countRed==0&&countBlue==1) {
            System.out.println("六等奖 5元");
        }else{
            System.out.println("很遗憾，此次没有中奖，但是别灰心，下次一定中奖");
        }

    }
}

