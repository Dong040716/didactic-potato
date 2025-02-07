package StringBuilderPractice;

public class StringBuilder2 {
    public static void main(String[] args) {
        //定义一个方法，把int数组中的数据按照制定格式拼接成一个字符串返回
        int[] arr={1,2,3,4,5,6};
        //调用方法
        String s=arrToString(arr);
        System.out.println(s);

    }
    public static String arrToString(int[] arr){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i!=arr.length-1){
                sb.append(arr[i]).append(",");
            }
            else {
                sb.append(arr[i]);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
