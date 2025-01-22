package loopPractice;

public class test1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                //continue关键字，跳过本次循环，开始下一次循环
                continue;
            }
            System.out.println("当前是第" + i + "次循环");
        }
        for(int j=1;j<=5;j++){
            if (j==4){
                //结束整个循环
                break;
            }
            System.out.println("当前是第" + j + "次循环");
        }

    }
}