public class whilePractice {
    public static void main(String[] args) {
        double height = 0.1;
        int count=0;//用来记录折叠次数
        while (height <=8844430) {
            height=height*2;
            count++;
        }
        System.out.println(count);
        System.out.println(height);
    }
}
