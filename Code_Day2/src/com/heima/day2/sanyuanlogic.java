package com.heima.day2;

public class sanyuanlogic {
    public static void main(String[] args) {
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;
        //temp
        int temp = height1 > height2 ? height1 : height2;
        int max = temp > height3 ? temp : height3;
        //ctrl alt l 自动格式化代码
        System.out.println(max);
    }
}
