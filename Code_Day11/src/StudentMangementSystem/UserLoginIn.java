package StudentMangementSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserLoginIn {
    //创建一个全局变量，所有的函数都可以使用Scanner来进行输入操作
    public static Scanner sc = new Scanner(System.in);
    public static Random r = new Random();//用于随机数操作

    public static void main(String[] args) {
        //创建集合，用于存储用户信息
        ArrayList<User> users = new ArrayList<>();
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作:1.登录 2.注册 3.忘记密码 0.退出");
            int choice = sc.nextInt();
            switch (choice) {
                case 0: {
                    return;
                }
                case 1: {
                    //调用登陆函数
                    if (userLoginIn(users))
                        StudentSystem.StartSystem();
                    else
                        System.out.println("登录失败");
                    break;
                }
                case 2: {
                    //调用注册函数
                    if (userRegister(users)) {
                        System.out.println("用户注册成功！");
                    }
                    break;
                }
                case 3: {
                    //调用忘记密码函数
                    forgetPassword(users);
                    break;
                }
            }
        }
    }

    //注册用户信息
    public static boolean userRegister(ArrayList<User> users) {
        //先创建一个user对象
        User user = new User();
        //执行注册
        System.out.println("请输入用户名!");
        String userName = sc.next();
        //判断用户名是否合法
        if (!validUserName(userName, users)) {
            return false;
        } else {
            //把用户名赋值给user对象
            user.setUserName(userName);
        }
        //用户密码需要输入两次
        System.out.println("请输入密码!");
        String firstInput = sc.next();
        System.out.println("请再次确认密码!");
        String secondInput = sc.next();
        if (!firstInput.equals(secondInput)) {
            System.out.println("两次输入的密码不一致");
            return false;
        } else {
            //把用户密码赋给user对象
            user.setPassword(firstInput); //secondInput
        }
        //验证身份证号码是否合法
        System.out.println("请输入身份证号码：");
        String idNumber = sc.next();
        if (!validIdNumber(idNumber, users)) {
            return false;
        } else {
            //把身份证号码赋值给user对象
            user.setIdNumber(idNumber);
        }
        //检验手机号是否合法
        System.out.println("请输入手机号码：");
        String phoneNumber = sc.next();
        if (!validPhoneNumber(phoneNumber)) {
            return false;
        } else {
            //手机号赋值给user对象
            user.setPhoneNumber(phoneNumber);
        }
        //把user对象添加到users集合中
        users.add(user);
        return true;
    }

    //注册时，用户名需要满足的要求
    public static boolean validUserName(String userName, ArrayList<User> users) {
        //先验证用户名是否重复
        for (User user : users) {
            if (user.getUserName().equals(userName)) {
                System.out.println("用户名重复!");
                return false;
            }
        }
        //再验证用户名的长度
        int length = userName.length();
        if (!(length <= 15 && length >= 3)) {
            //长度不在3~15范围内
            System.out.println("用户名长度不符合要求");
            return false;
        }
        //再检验用户名是否满足字母＋数字的要求
        int characterNumber = 0; //用于记录字母的个数
        for (int i = 0; i < userName.length(); i++) {
            char temp = userName.charAt(i);
            if (!(temp <= '9' && temp >= '0' || temp <= 'z' && temp >= 'a' || temp <= 'Z' && temp >= 'A')) {
                //有非字母或数字的字符
                System.out.println("用户名必须是字母和数字的组合!");
                return false;
            }
        }
        //第二遍循环检验是否为字母与数字的组合
        for (int i = 0; i < userName.length(); i++) {
            char temp2 = userName.charAt(i);
            if (temp2 <= 'z' && temp2 >= 'a' || temp2 <= 'Z' && temp2 >= 'A') {
                characterNumber++;
            }
        }
        if (characterNumber == 0) {
            //全部是数字
            System.out.println("用户名必须为数字和字母的组合！");
            return false;
        }
        //没有返回false则说明用户名规范合法，返回true
        return true;
    }

    //注册时，身份证号码需要满足的要求
    public static boolean validIdNumber(String idNumber, ArrayList<User> users) {
        //首先判断身份证号码是否已经存在
        for (User temp : users) {
            if (temp.getIdNumber().equals(idNumber)) {
                //身份证号码已经存在
                System.out.println("身份证号已经存在！");
                return false;
            }
        }
        //判断其余条件
        if (idNumber.length() != 18) {
            System.out.println("身份证长度不符合标准");
            return false;
        } else if (idNumber.charAt(0) == '0') {
            System.out.println("身份证号不能以0开头");
            return false;
        }
        //判断前十七位是否都是数字
        for (int i = 0; i < idNumber.length() - 1; i++) {
            char temp = idNumber.charAt(i);
            if (!(temp <= '9' && temp >= '0')) {
                System.out.println("身份证号前十七位必须是数字");
                return false;
            }

        }
        //最为一位可以是数字，也可以是大写X或小写x
        char lastChar = idNumber.charAt(idNumber.length() - 1);
        if ((lastChar <= '9' && lastChar >= '0') || (lastChar == 'x') || (lastChar == 'X')) {
            return true;
        } else {
            System.out.println("最后一位只能是数字，X或x!");
            return false;
        }
    }

    //注册时，手机号需要满足的要求
    public static boolean validPhoneNumber(String phoneNumber) {
        //验证长度是否为11位
        int length = phoneNumber.length();
        if (length != 11) {
            System.out.println("长度必须为11位！");
            return false;
        }
        //检验是否以零开头
        char firstNumber = phoneNumber.charAt(0);
        if (firstNumber == '0') {
            return false;
        }
        //检验是否都是数字
        for (int i = 0; i < phoneNumber.length(); i++) {
            char temp = phoneNumber.charAt(i);
            if (!(temp <= '9' && temp >= '0')) {
                return false;
            }
        }
        return true;
    }

    //生成验证码
    public static String generateCheckNumber() {
        //创建字符数组，把字母放入数组中
        char[] characterArr = new char[52];
        char start = 'a';
        char Start = 'A'; // 从字符a和A一起开始录入进数组中
        for (int i = 0, j = characterArr.length / 2; i < characterArr.length / 2; i++, j++) {
            characterArr[i] = start++;//先赋值，后++
            characterArr[j] = Start++;
        }
        //存放随机索引的数组
        int[] randomIndexArr = new int[4];
        //生成四个随机的索引
        for (int i = 0; i < randomIndexArr.length; i++) {
            int randomIndex = r.nextInt(0, characterArr.length);
            randomIndexArr[i] = randomIndex;
        }
        //生成随机的字母序列，放入SB容器中
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < randomIndexArr.length; i++) {
            sb.append(characterArr[randomIndexArr[i]]);
        }
        //生成一个随机数字
        int randomNumber = r.nextInt(0, 10);//范围为0~9
        //生成数字的随机插入位置
        int randomInsertNumber = r.nextInt(0, sb.length() + 1);//范围0~4
        sb.insert(randomInsertNumber, randomNumber);
        //转换为字符串返回
        return sb.toString();
    }

    //用户登陆功能
    public static boolean userLoginIn(ArrayList<User> users) {
        System.out.println("请输入用户名:");
        String userName = sc.next();
        if (!userContains(userName, users)) {
            //用户未注册
            System.out.println("用户名未注册，请先注册");
            return false;
        }
        System.out.println("请输入密码：");
        String password = sc.next();
        //生成验证码并且让用户输入验证码
        String systemCheckNumber = generateCheckNumber();
        System.out.printf("验证码为：%s", systemCheckNumber);
        System.out.println();
        //判断验证码是否正确
        while (true) {
            System.out.println("请输入验证码：");
            String checkNumber = sc.next();
            if (checkNumber.equals(systemCheckNumber)) {
                break;
            } else {
                System.out.println("验证码不正确，请重新输入验证码!");
            }
        }
        //最后检测用户名和密码是否正确，共有三次登陆机会
        int index = returnIndexOfUser(userName, users);
        if (index != -1 && users.get(index).getPassword().equals(password)) {
            //用户名和密码正确
            return true;
        } else {
            int attempts = 2;
            System.out.printf("密码错误，请重新输入密码！(还有%s次机会)", attempts);
            while (attempts > 0) {
                password = sc.next();
                if (users.get(index).getPassword().equals(password)) {
                    return true;
                } else {
                    attempts--;
                }
            }
            return false;
        }
    }

    //判断用户名是否存在
    public static boolean userContains(String userName, ArrayList<User> users) {
        return returnIndexOfUser(userName, users) != -1;
    }

    //返回用户名存在出的索引
    public static int returnIndexOfUser(String userName, ArrayList<User> users) {
        for (int i = 0; i < users.size(); i++) {
            User temp = users.get(i);
            if (temp.getUserName().equals(userName)) {
                return i;
            }
        }
        //不存在此用户名则返回-1
        return -1;
    }

    //忘记密码的函数
    public static void forgetPassword(ArrayList<User> users) {
        //1.键盘录入用户名，判断当前用户名是否存在，如不存在，直接结束方法，并提示：未注册
        // 2，键盘录入身份证号码和手机号码
        // 3，判断当前用户的身份证号码和手机号码是否一致，如果一致，则提示输入密码，进行修改。如果不一致，则提示：账号信息不匹配，修改失败。
        System.out.println("请输入需要修改的用户名");
        String userName = sc.next();
        //此变量用来记录索引值（如果用户存在）
        int index = returnIndexOfUser(userName, users);
        if (index != -1) {
            //用户名存在，录入身份证号码和手机号码
            System.out.println("请输入身份证号码！");
            String idNumber = sc.next();
            System.out.println("请输入手机号码！");
            String phoneNumber = sc.next();
            //判断身份证号码和手机号码是否一致
            boolean equalIdNumber = users.get(index).getIdNumber().equals(idNumber);
            boolean equalPhoneNumber = users.get(index).getPhoneNumber().equals(phoneNumber);
            if (equalPhoneNumber && equalIdNumber) {
                System.out.println("请输入新的密码！");
                String newPassword = sc.next();
                users.get(index).setPassword(newPassword);
                System.out.println("密码修改成功");
            } else {
                System.out.println("账号信息不匹配，修改失败！");
            }
        } else {
            System.out.println("用户名未注册！");
        }
    }

}
