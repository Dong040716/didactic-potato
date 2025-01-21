public class switchPractice1 {
    public static void main(String[] args) {
            String noodles="兰州拉面";
            switch (noodles){
                case "兰州拉面":
                    System.out.println("吃兰州拉面");
                    break;
                case "热干面":
                    System.out.println("吃热干面");
                    break;
                default:
                    System.out.println("吃泡面");
                    break;
            }
    }
}
