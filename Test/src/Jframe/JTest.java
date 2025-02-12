package Jframe;

import javax.swing.*;
import java.io.File;
import java.nio.file.Path;

public class JTest {
    public static void main(String[] args) {

        JFrame frame = new JFrame("456");
        frame.setSize(1000, 700);

        File file = new File(".\\Images\\ori.jpg");
        System.out.println(file.exists());

        //增加button
        JButton button = new JButton("Click Me");
        button.setBounds(0, 0, 100, 50);

        //增加label
        JLabel label1 = new JLabel("I am Label");
        label1.setBounds(50, 50, 100, 50);

        ImageIcon icon = new ImageIcon(".\\Images\\ori.jpg");
        JLabel label2 = new JLabel(icon);
        label2.setBounds(100, 100, 200, 200);

        //將控鍵新增至panel上
        //frame.add(button);
        frame.getContentPane().add(button);
        frame.add(label1);
        frame.add(label2);

        //取消默認布局
        frame.setLayout(null);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
