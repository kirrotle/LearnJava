public class Hello {
    public static void main(String[] args) {
        //需記住不是Outer.Inner x = new Outer.Inner();
        //需要先有外部的Outer,才可以創建內部的Inner
        Outer.Inner x = new Outer().new Inner();
    }
}

class Outer {

    public Outer(){
        Inner x = new Inner();
        x.method();
    }

    private void method(){
        System.out.println("Outer method");
    }

    class Inner {

        private void method(){
            System.out.println("Inner method");
        }

         public Inner(){
             System.out.println("我是內部類");
             //當沒有Inner.method的方法可以直接呼叫到Outer.method
             method();
             //當內部也有一個method時就得這樣使用
             //因為嚴格來說也是自己本類的成員
             //感覺需要想的是this.num其實是Inner.this.num
             //所以
             Inner.this.method();
             Outer.this.method();
        }
    }
}

