public class InnerEx6 {
    // 익명클래스 . 일회용임.
    Object iv = new Object() {
        void method() {
        }
    };
    static Object cv = new Object() {

        void method() {
        }
    };

    void myMethod() {
        Object lv = new Object() {
            void method() {
            }
        };
    }

}
