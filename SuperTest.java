public class SuperTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}

class Parent {
    int x = 10;
}

class Child extends Parent {
    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
    // 여기서 x, this.x, super.x 는 모두 int x 를 뜻한다.
    // this.x : 인스턴스 변수 x
    // super.x : 조상클래스로부터 상속받은 변수 x
}
