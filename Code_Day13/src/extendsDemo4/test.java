package extendsDemo4;

public class test {
    public static void main(String[] args) {
        Lecturer l = new Lecturer();
        l.doWork();
        Tutor t = new Tutor();
        t.doWork();
        Maintainer m = new Maintainer();
        m.doWork();
        Buyer b = new Buyer();
        b.doWork();
    }
}
