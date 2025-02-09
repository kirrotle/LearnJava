package Jframe;

import javax.swing.*;
public class JTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("456");

        //設置窗口大小(px為單位)
        frame.setSize(500,400);

        frame.setVisible(true);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
