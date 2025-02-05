package StringPractice;

import java.util.Scanner;

public class loginIn {
    //全局变量
    //定义用户名
    private String userName = "dongxin";
    //定义密码
    private String userPassword = "dongxin123";

    public static void main(String[] args) {
        //已知正确的用户名和密码，程序实现模拟用户登陆，总共给三次机会，登陆之后，给出对应的提示
        loginIn u=new loginIn();
        Scanner sc = new Scanner(System.in);
        //登录次数
        int loginCount = 0;
        while (loginCount < 3) {
            System.out.print("请输入用户名：");
            String inputName = sc.next();
            System.out.print("请输入密码：");
            String inputPassword = sc.next();
            //调用用户名密码的检验函数
            if (u.userLoginIn(inputName, inputPassword)) {
                //如果用户名和密码正确，则跳出循环
                System.out.println("登陆成功");
                break;
            } else {
                //用户名和密码不正确
                System.out.println("用户名或密码错误，请重新输入！");
                loginCount++;
            }
        }
        //退出循环之后对登陆次数count进行判断
        if (loginCount == 3) {
            System.out.println("错误次数太多，账号已冻结");
        }

    }

    public boolean userLoginIn(String inputName, String inputPassword) {
        return inputName.equals(userName) && inputPassword.equals(userPassword);
    }
}
