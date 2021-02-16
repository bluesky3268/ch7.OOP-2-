public class InnerEx1 {
    class InstanceInner {
        int iv = 100;
        // static int cv = 100; =>> static클래스만 static변수를 가질 수 있음.
        final static int CONST = 100; // 상수는 허용
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 200;
    }

    void myMethod() {
        class LocalInner {
            int iv = 300;
            // static int cv = 300; =>> static클래스만 static변수를 가질 수 있음.
            final static int CONST = 300; // 상수는 허용
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
    }
}
