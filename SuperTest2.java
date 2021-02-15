public class SuperTest2 {
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.method();
    }
}

class Parent2 {
    int x = 10;
}

class Child2 extends Parent2 {
    int x = 20;

    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
    // x : 인스턴스 변수 x => 20
    // this.x : 인스턴스 변수 x => 20
    // super.x : 상속받은 조상클래스의 변수 x => 10
}
