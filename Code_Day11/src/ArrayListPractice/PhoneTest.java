package ArrayListPractice;

import java.util.ArrayList;

public class PhoneTest {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Phone> phones = new ArrayList<>();
        //创建手机对象
        Phone p1 = new Phone("小米", 1000);
        Phone p2 = new Phone("苹果", 8000);
        Phone p3 = new Phone("锤子", 2999);
        //添加手机对象
        phones.add(p1);
        phones.add(p2);
        phones.add(p3);
        //调用方法，将价格低于3000的手机信息返回
        ArrayList<Phone> phonesUnder3000=PriceUnder3000(phones,3000);
        for (Phone phone : phonesUnder3000) {
            System.out.println(phone.getBrand());
            System.out.println(phone.getPrice());
        }
    }

    //创建方法，返回价格低于3000的手机信息
    public static ArrayList<Phone> PriceUnder3000(ArrayList<Phone> phones, double price) {
        //创建一个新的集合当做返回值
        ArrayList<Phone> returnPhones = new ArrayList<>();
        //遍历集合
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).getPrice() < price) {
                //价格低于三千，则将集合中的此对象添加进新的集合中
                returnPhones.add(phones.get(i));
            }
        }
        return returnPhones;
    }
}
