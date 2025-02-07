package exercises;

public class exercise2 {
    public static void main(String[] args) {
        //定义两个字符串A和B
        StringBuilder A = new StringBuilder("12345");
        StringBuilder B = new StringBuilder("34512");
        System.out.println(ifEqualsAfterTurnOver(A, B));
    }

    public static boolean ifEqualsAfterTurnOver(StringBuilder A, StringBuilder B) {
        for (int i = 0; i < A.length(); i++) {
            //每次都进行一个翻转的操作
            char temp = A.charAt(0);
            A.deleteCharAt(0).append(temp);
            //翻转之后进行字符容器的比较
            if (A.toString().contentEquals(B)) {
                return true;
            }
        }
        return false;
    }
}
