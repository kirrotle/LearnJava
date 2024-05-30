public class Hello {
    public static void main(String[] args) {
        //因為Animal類沒有這個方法,所以在new的時候需要定義這個方法
        Animal x = new Animal(){
            public void eat() {
                System.out.println("456");
            }
        };
        x.eat();
    }
}

abstract class Animal{
    public abstract void eat();
}

class Dog extends Animal{

    //Dog類一定要有這個方法
    @Override
    public void eat(){
        System.out.println("123");
    }

}
