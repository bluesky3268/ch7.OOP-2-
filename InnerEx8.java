import java.awt.*;
import java.awt.event.*;

public class InnerEx8 {
    public static void main(String[] args) {
        Button b = new Button("start");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred!!!");
            }
        }// 익명클래스 끝
        );
    } // 메인 끝

}
