public class Hello {
    public static void main(String[] args) {
        inter.function();
    }
}


interface inter{
    //可以使用靜態方法
    public static void function(){
        System.out.println("inter function");
    }
}
