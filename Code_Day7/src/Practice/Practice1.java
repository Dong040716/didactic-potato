package Practice;

import java.util.Scanner;


public class Practice1 {
    //宏定义,方便维护
    public static double discountWang1 = 0.9;
    public static double discountWang2 = 0.85;
    public static double discountDan1 = 0.7;
    public static double discountDan2 = 0.65;

    public static void main(String[] args) {
        //定义机票的价格，月份，头等舱/经济舱
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入机票的原价:");
        double price = sc.nextInt();
        System.out.print("请输入购票的月份:");
        int month = sc.nextInt();
        System.out.print("请输入购票类型 1.头等舱 2.经济舱: ");
        int types = sc.nextInt();
        //调用方法
        double discountPrice=getPrice(price,month,types);
        System.out.print("最终的价格为:"+discountPrice);
    }

    //定义方法
    public static double getPrice(double price, int month, int types) {
        double finalPrice=0;
        switch (month) {
            //旺季
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10: {
                if (types == 1) {//头等舱
                    finalPrice = price * discountWang1;
                } else {
                    finalPrice = price * discountWang2;
                }
                break;
            }
            case 11:
            case 12:
            case 1:
            case 2:
            case 3:
            case 4:{
                if (types == 1) {//头等舱
                    finalPrice = price * discountDan1;
                } else {
                    finalPrice = price * discountDan2;
                }
                break;
            }
            default:{
                System.out.println("月份信息出错!");
                break;
            }

        }
        return finalPrice;
    }
}
