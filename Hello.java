public class Hello {
    public static void main(String[] args) {
        interA x = new interA();
        x.method();
        //interB就算沒覆寫method方法也有method方法
        interB y = new interB();
        y.method();
    }
}

interface A{
    public default void method (){
        System.out.println("A method");
    }
}

interface inter{
    void show();
    void print();
    //只要使用default就可以在interface中寫有方法體的方法
    public default void method(){
        System.out.println("inter method");
    }
}

class interA implements inter,A{
    @Override
    public void show() {
        System.out.println("interA show");
    }

    @Override
    public void print() {
        System.out.println("interA print");
    }

    //可以覆寫父類的method方法
    @Override
    public void method(){
        //這邊須注意interA的父類有兩個
        //一個是inter另一個是Object
        //最直屬的是Object,但是Object沒有method方法所以會抱錯
        //旁系的是inter,但是得透過inter.super才可以呼叫到inter的方法
        //super.method();
        inter.super.method();
        System.out.println("interA method");
    }
}

//這邊就會出錯了,因為interB同時繼承inter跟A interface的方法
//編譯器不知道要用那哪一個
class interB implements inter,A{
    @Override
    public void show() {
        System.out.println("interB show");
    }

    @Override
    public void print() {
        System.out.println("interB print");
    }
}
