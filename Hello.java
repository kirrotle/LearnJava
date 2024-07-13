public class Hello {
    public static void main(String[] args) {
        //一般來說是使用class去繼承interface之後覆寫method方法
        //test是interface的實現類
        UseInter(new test());

        //Anonymous Inner Class是直接在程式碼中直接覆寫method方法
        //節省還要再寫一個繼承inter的class
        //下面的這一大串就是inter的實現類對象,只是是一個沒有名字的class而已
        UseInter(new inter() {
            @Override
            public void method() {
                System.out.println("123");
            }
        });
    }

    public  static  void UseInter(inter i){
        i.method();
    }


}

interface inter{
    void method();
}

class test implements inter{

    @Override
    public void method() {
        System.out.println("test implement inter");
    }

}
