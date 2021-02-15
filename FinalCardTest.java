class Card2 {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    Card2(String kind, int num) {
        KIND = kind;
        NUMBER = num;
        // 매개변수로 넘겨받은 값으로 KIND와 NUMBER값을 초기화
    }

    Card2() {
        this("HEART", 1);
    }

    public String toString() {
        return KIND + " " + NUMBER;
    }
}

public class FinalCardTest {
    public static void main(String[] args) {
        Card2 c = new Card2("SPADE", 10);
        // c.NUMBER = 5; final(상수) 값은 변경할 수 없음.
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);
    }

}
