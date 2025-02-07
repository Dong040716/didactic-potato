package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //泛型：集合中存储数据的类型
        ArrayList<String> list = new ArrayList<>();
        //打印的对象不是地址值，而是集合中存储的数据内容
        System.out.println(list);//打印 []
        //add
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println("After add:");
        System.out.println(list);
        //remove
        list.remove("aaa");
        System.out.println("After remove 'aaa':");
        System.out.println(list);
        //set
        String seted=list.set(0,"AAA");
        System.out.printf("%s was set:",seted);
        System.out.println();
        System.out.println(list);
        //get
        String geted= list.get(0);
        System.out.printf("After get %s",geted);
        System.out.println();
        System.out.println(list);
    }
}
