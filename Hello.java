public class Hello {
    public static void main(String[] args) {
        Dog x = new Dog();
        x.eat();
    }
}

abstract class Animal{
    public String name ="123";
    public abstract void eat();
}

class Dog extends Animal{

    //Dog類一定要有這個方法
    @Override
    public void eat(){
        System.out.println(super.name);
        System.out.println("123");
    }

}
