package Jframe;

import javax.swing.*;
public class JTest {
    public static void main(String[] args) {

        JFrame frame = new JFrame("456");
        frame.setSize(500,400);

        //增加控鍵
        JButton button = new JButton("Click Me");
        button.setBounds(0,0,100,50);

        //將控鍵新增至panel上
        //frame.add(button);
        frame.getContentPane().add(button);

        //取消默認布局
        frame.setLayout(null);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
