public class Hello {//這個是Class Block
    public static void main(String[] args) {//這個是Method Block
        Test x = new Test();
        Test y = new Test(123);
    }
}

class Test{

    {
        System.out.println("所有constructor都會跑");
    }

    public Test(){
        System.out.println("沒參數的constructor");
    }

    public Test(int x){
        System.out.println("有參數的constructor");
    }

}

