package Stringdemo;

public class StringDemo3 {
    public static void main(String[] args) {
        //定义一个字符串，把int数组中的数据按照格式拼接成一个字符串返回
        int[] arr = {1};
        String testString = arrToString(arr);
        System.out.println(testString);

    }

    public static String arrToString(int[] arr) {
        //定义一个字符串数组接受int数组中的元素
        String strings = "";
        //加左括号
        strings = strings + '[';
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                //代表是数组中的最后一个元素，只需要拼接元素，不需要加逗号
                strings = strings + arr[i];
            } else {
                strings = strings + arr[i];
                strings = strings + ',';
            }
        }
        //加右括号
        strings = strings + ']';
        return strings;
    }
}
