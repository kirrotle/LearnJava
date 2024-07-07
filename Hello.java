public class Hello {
    public static void main(String[] args) {
        Outer x = new Outer();
        x.method();
    }
}

class Outer{

    public void method(){

        class Inner{
            public void method(){
                System.out.println("Inner method");
            }
        }

        Inner x = new Inner();
        x.method();
    }

}

