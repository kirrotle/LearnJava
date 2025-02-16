package WinEvent;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class WinEventTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("WinEventTest");

        JButton button = new JButton("Click Me");
        button.setBounds(0, 0, 100, 100);
        button.setFocusable(false);
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

        //增加鍵盤事件
        //鍵盤需有更多的事件處理,所以寫成一個class會比較好
        frame.addKeyListener(new KeyEvent());

        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void ClickMe() {
        System.out.println("456");
    }
}

class KeyEvent implements KeyListener {

    @Override
    public void keyTyped(java.awt.event.KeyEvent e) {
//        System.out.println("keyTyped");
    }

    @Override
    public void keyPressed(java.awt.event.KeyEvent e) {
//        System.out.println("keyPressed");
    }

    @Override
    public void keyReleased(java.awt.event.KeyEvent e) {
        System.out.println("keyReleased");
        int keyCode = e.getKeyCode();
        System.out.println(keyCode);
        switch (keyCode) {
            case 37:
                System.out.println("Left Press");
                break;
            case 38:
                System.out.println("Up Press");
                break;
            case 39:
                System.out.println("Right Press");
                break;
            case 40:
                System.out.println("Down Press");
                break;
        }
    }
}
