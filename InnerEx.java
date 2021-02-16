public class InnerEx {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner {
        int iiv = outerIv;
        int iiv2 = outerCv;
    }

    static class StaticInner {
        // int siv = outerIv; static클래스는 외부 클래스의 인스턴스변수에 접근할 수 없음.
        static int scv = outerCv;
    }

    void myMethod() {
        int lv = 0;
        final int LV = 0;
        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;
            // int liv3 = lv; 외부클래스의 지역변수는 final이 붙은 상수만 접근가능함 (하지만 jdk1.8부터는 에러가 아님.)
            int liv4 = LV;
        }
    }
}
