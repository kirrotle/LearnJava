public class Hello {
    public static void main(String[] args) {
        //因為interface的方法都有方法體所以可以直接使用
        inter x = new inter() {};
        x.start();

        inter.StaticStart();
    }
}


interface inter{
    public default void start(){
        log();
        System.out.println("start");
    }
    private void log(){
        System.out.println("write log");
    }

    public static void StaticStart(){
        StaticLog();
        System.out.println("StaticStart");
    }

    //也可以將static變成private
    private static void StaticLog(){
        System.out.println("write log");
    }
}
