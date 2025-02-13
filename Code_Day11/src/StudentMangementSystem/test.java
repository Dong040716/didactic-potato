package StudentMangementSystem;

public class test {
    public static void main(String[] args) {
        System.out.println(UserLoginIn.generateCheckNumber());
        clearConsole();
    }
    public static void clearConsole() {
        try {
            // 仅适用于 IntelliJ 2021.3+ 版本
            System.out.println("\u001B[2J\u001B[0;0H"); // 更安全的 ANSI 码
        } catch (Exception e) {
            System.out.println("\n".repeat(50)); // 回退方案
        }
    }

}

