public class switchExtend {
    public static void main(String[] args) {
        int number = 1;
        switch (number) {//   case 1-> instead of case 1 : + break, break消失之后也没有case穿透现象
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            default -> System.out.println("3");

        }
    }
}
