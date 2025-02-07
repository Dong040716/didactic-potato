package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    //定义一个集合，添加字符串，并且进行遍历
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        //添加元素
        arrayList.add("元素1");
        arrayList.add("元素2");
        arrayList.add("元素3");
        arrayList.add("元素4");
        System.out.println(arrayList);
        //遍历
        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
