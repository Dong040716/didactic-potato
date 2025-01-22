package loopPractice;

public class test2 {
    public static void main(String[] args) {
        //逢七过
        //数字1-100当中满足逢7过的原则的数字
        int i=1;
        while(i<=100)
        {
            //数字包含七或者是七的倍数
            if((i%10)==7||(i/10)==7||(i%7)==0){
                System.out.println(i+" Pass!");
            }
            i++;
        }
    }
}
