package Practice;

public class Practice2 {
    public static void main(String[] args) {
        //找质数
        //判断101~200之间有多少个素数，并输出所有素数。

        //建立一个标志位，用来标志此数据是否是素数
        boolean isPrime=true;
        //需要一个双重循环
        for (int i = 101; i <= 200; i++) {
            //每次循环开始前把flag置为true
            isPrime=true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime=false;//如果有能够整除的数字，isPrime置为false，表示此数字不是素数
                    break;//性能优化，如果能整除，直接跳过此次循环,跳出单层的内循环
                }
            }

            //对标志位进行判断
            if (isPrime){//表示是素数，打印输出结果
                System.out.println("数字"+i+"是素数");
            }

        }
    }
}