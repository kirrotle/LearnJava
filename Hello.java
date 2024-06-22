public class Hello {
    public static void main(String[] args) {
        final String x = "Hello World!";
    }
}

interface  inter1{
    void message1();
}

interface  inter2{
    void message2();
}

//需注意這邊是使用extends
interface  inter3 extends inter1,inter2{
    void message3();
}