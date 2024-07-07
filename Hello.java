public class Hello {
    public static void main(String[] args) {
        //需注意到這邊不用new Outer().new Inner()了
        //因為Inner是static
        Outer.Inner x = new Outer.Inner();
        x.method();

        //如果內部方法也是static可以直接使用
        Outer.Inner.method1();
    }
}

class Outer {

    public void method(){
        System.out.println("Outer method");
    }

    static class Inner {

        public void method(){
            System.out.println("Inner method");
            //會無法使用,因為Inner是static無法讀取非static的class
            //Outer.this.method();
            //所以要先new之後才可以使用
            Outer x = new Outer();
            x.method();
        }

        public static void method1(){
            System.out.println("Inner static method");
        }
    }

}

