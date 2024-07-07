import java.net.Socket;

public class Hello {//這個是Class Block
    public static void main(String[] args) {//這個是Method Block
        Test x = new Test();
    }
}

class Test{
    static {//static block
        System.out.println("類載入記憶體時最先執行的程式碼");
    }

    public Test(){
        System.out.println("constructor 載入");
    }
}

