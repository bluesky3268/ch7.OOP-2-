class Tv {
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

class CaptionTv extends Tv {
    boolean caption; // caption상태 on/off

    void displayCaption(String text) {
        if (caption) { // caption상태가 on일 경우에만 text를 출력하여 보여준다.
            System.out.println(text);
        }
    }
}

public class CaptionTvTest {

    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello World"); // boolean의 기본값은 false이기 때문에 text출력 안됨.
        ctv.caption = true; // caption을 on(true)로 바꿔 준 후
        ctv.displayCaption("Hello World"); // 다시 displayCaption메소드를 호출하면 출력됨.

    }
}