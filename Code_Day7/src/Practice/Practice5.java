package Practice;

import java.util.Arrays;
import java.util.SplittableRandom;

public class Practice5 {
    public static void main(String[] args) {
        // 某系统的数字密码（大于0），比如1983，采用加密方式进行传输。
        // 先得到每位数，然后每位数都加上5 , 再对10求余，最后将所有数字反转，得到一串新数。
        //利用数组定义数字密码
        int []originPassword={1,9,8,3};
        //每位数加5
        for (int i = 0; i < originPassword.length; i++) {
            originPassword[i]=originPassword[i]+5;
        }
        //每位数对10求余
        for (int i = 0; i < originPassword.length; i++) {
            originPassword[i]=originPassword[i]%10;
        }
        //翻转数组中的数字
        for (int i = 0,j=originPassword.length-1; i < j; i++,j--) {
            int temp=originPassword[i];
            originPassword[i]=originPassword[j];
            originPassword[j]=temp;
        }
        //拼接翻转后的密码
        String finalPassword="";
        for (int i = 0; i < originPassword.length; i++) {
            finalPassword=finalPassword+originPassword[i];
        }
        System.out.println(finalPassword);

    }
}
