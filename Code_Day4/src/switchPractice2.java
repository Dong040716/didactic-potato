import java.util.Scanner;

public class switchPractice2 {
    public static void main(String[] args) {
        //键盘录入星期
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the day of the week that it is");
        int dayNum = sc.nextInt();
        switch (dayNum) {//switch case 语句进行匹配
            case 1:
                System.out.println("Running");
                break;
            case 2:
                System.out.println("Swimming");
                break;
            case 3:
                System.out.println("Hang out");
                break;
            case 4:
                System.out.println("Ride");
                break;
            case 5:
                System.out.println("Boxing");
                break;
            case 6:
                System.out.println("Climb the mountion");
                break;
            case 7:
                System.out.println("A good meal");
                break;
            default:
                System.out.println("Error number of the day of a week");
                break;
        }
    }
}
