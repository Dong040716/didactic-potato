package exercises;


public class exercise8 {
    //定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果。
    public static void main(String[] args) {
        int[] arr = null;
        int[] arr2 = new int[3];
        //调用方法
        System.out.println(arrToString(arr));
        System.out.println(arrToString(arr2));
    }

    public static String arrToString(int[] arr) {
        //先判断参数是否为空
        if (arr == null) {
            return null;
        } else if (arr.length == 0) {//数组元素个数为0
            return "[]";
        } else {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(","); //添加数据和逗号分隔符
            }
            //添加 ]
            sb.append("]");
            //删除最后一个逗号
            sb.deleteCharAt(sb.length() - 2);
            return sb.toString();
        }
    }
}
