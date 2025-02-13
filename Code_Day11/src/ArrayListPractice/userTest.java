package ArrayListPractice;

import java.util.ArrayList;

public class userTest {
    public static void main(String[] args) {
        //定义集合
        ArrayList<User> userArrayList = new ArrayList<>();
        //存入三个用户对象
        User u1 = new User(1, "user1", "123456");
        User u2 = new User(2, "user2", "123456");
        User u3 = new User(3, "user3", "123456");
        userArrayList.add(u1);
        userArrayList.add(u2);
        userArrayList.add(u3);
        //调用方法，根据id查找对应的信息
        searchInfo(1,userArrayList);
    }

    public static void searchInfo(int id,ArrayList<User> userArrayList) {
        User temp=new User();
        for (int i = 0; i < userArrayList.size(); i++) {
            if(id==userArrayList.get(i).getId()){
                //如果找到了对应的id，变量temp存储user对象信息
                temp=userArrayList.get(i);
                break;//跳出循环
            }
        }
        System.out.println("用户的用户名为：");
        System.out.println(temp.getUsername());
        System.out.println("用户的密码为：");
        System.out.println(temp.getPassword());
    }

}
