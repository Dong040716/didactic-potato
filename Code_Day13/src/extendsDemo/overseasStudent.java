package extendsDemo;

class overseasStudent extends Person {
    public void lunch() {
        this.eat();
        this.drink();
        super.eat();
        super.drink();
    }

    @Override
    public void eat() {
        System.out.println("吃西餐");
    }

    @Override
    public void drink() {
        System.out.println("喝可乐");
    }

}
