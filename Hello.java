//引用javax.swing組件底下的所有class
import javax.swing.*;

public class Hello {
    public static void main(String[] args) {

        //創建視窗對象
        JFrame frame = new JFrame("Hello");

        //設置視窗大小
        frame.setSize(500,500);

        //設置視窗標頭
        frame.setTitle("OUO");

        //重要
        //設置視窗關閉時是否要連程序一起關閉(不然會產生視窗關閉但程式還是在跑的現象)
        //透過f12查看setDefaultCloseOperation內部的方法如何實現,
        //發現是用WindowConstants這個Interface裡面寫的變數來控制
        //因為setDefaultCloseOperation的參數為int直接寫數字也可以
        //但是寫常數會比較直觀的知道這是做甚麼的
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //設置視窗是否顯示
        //這個一定要寫在最後面,因為一定要等到設置初始化完後才可以顯示
        frame.setVisible(true);
    }
}

