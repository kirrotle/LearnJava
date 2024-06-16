public class Hello {
    public static void main(String[] args) {
        inter1 x = new inter1();
        x.show();
    }
}

interface inter {
    //接口可以允許普通的變數
    public String val = "";
    //這個會出錯,因為interface不允許方法有方法體
//    public void method1(){
//        System.out.println("123");
//    }
    //沒寫方法體就部會出錯了,且可以
    public void method2();
    //正常寫法
    public abstract void show();
    public abstract void method();
}

class inter1 implements inter{
    @Override
    public void show() {
        System.out.println("show");
    }

    @Override
    public void method() {}

    //就算是沒有寫abstract還是要繼承
    @Override
    public void method2() {
        //寫不出val
        //super.val
    }

}

