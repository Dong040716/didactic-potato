package arrayList;

public class arrayDemo2 {
    public static void main(String[] args) {
        //数组的遍历，利用循环
        //java中，数组的长度属性，length
        //调用方式:数组名.length
        int []array = {1, 2, 3, 4, 5};
        //利用长度属性作为循环结束条件
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //idea 中自动补全遍历 数组名.fori
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
    }
}
