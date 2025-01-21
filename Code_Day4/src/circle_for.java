public class circle_for {
    public static void main(String[] args) {
        //for 循环中的1-5数字累加
        //sum定义在循环外
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            //先判断，再进行累加求和
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("sum=" + sum);
    }
}
