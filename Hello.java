public class Hello {
    public static void main(String[] args) {

        //因為這邊只有一個方法所以知道這個方法是for method function的
        UseInter(() ->{
            System.out.println("123");
        });

        //Inter1使用Lambda表達式就會出錯因為不知道是給method還是method1
//        UseInter1(() ->{
//            System.out.println("123");
//        });
    }

    public  static  void UseInter(inter i){
        i.method();
    }

    public  static  void UseInter1(inter1 i){
        i.method();
    }

}

//如果Interface中只有一個function需要被實現的話,
//就可以被稱為函數式編程接口
@FunctionalInterface
interface inter{
    void method();
}

//會發現語法糖報錯,因為這邊無法同時擁有兩個方法
//@FunctionalInterface
interface inter1{
    void method();
    void method1();
}

class test implements inter{

    @Override
    public void method() {
        System.out.println("test implement inter");
    }

}
