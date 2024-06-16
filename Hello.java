import Test1.Inter;

public class Hello {
    public static void main(String[] args) {
        impl x = new impl();
        x.method();
    }
}

class impl implements Inter {

    //如果沒寫method function會報錯,可以證明系統默認有加上abstract
    //並且可以跨package使用只有可能是protect或是public
    @Override
    public void method() {
        System.out.println("123");
    }
}
