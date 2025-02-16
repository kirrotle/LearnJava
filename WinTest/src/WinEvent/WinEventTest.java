package WinEvent;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WinEventTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("WinEventTest");

        JButton button = new JButton("Click Me");
        button.setBounds(0, 0, 100, 100);
        //可以這樣子綁定事件(簡單)
        button.addActionListener((e) -> {
            ClickMe();
        });
        //或是這樣子(複雜,但比較正規)
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("OnClick Trigger");
            }
        });
        frame.add(button);

        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void ClickMe() {
        System.out.println("456");
    }
}
