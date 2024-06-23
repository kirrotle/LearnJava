public class Hello {
    public static void main(String[] args) {
        father x = new father();
        //這邊調用都是使用父類的變數及功能
        //雖然可以正常的使用靜態變數及方法,
        //但是在編譯時會把實例化的名稱換成類名
        //x.staticNum -> father.staticNum
        //x.StaticShow() -> father.StaticShow()
        System.out.println(x.staticNum);
        x.StaticShow();
    }
}

class father{
    public int num = 10;
    public static int staticNum = 1;
    public void show (){
        System.out.println("father");
    }
    public static void StaticShow(){
        System.out.println("static father");
    }
}

class son extends father{
    public int num = 20;
    public static int staticNum = 2;
    @Override
    public void show (){
        System.out.println("son");
    }
    public static void StaticShow(){
        System.out.println("static son");
    }
}

