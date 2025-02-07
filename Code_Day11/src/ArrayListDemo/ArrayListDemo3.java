package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo3 {
    //基本数据类型对应的包装类
    //int  --> Integer
    //char --> Character
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<Integer> list=new ArrayList<>();
        //2.添加元素
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
    }
}
