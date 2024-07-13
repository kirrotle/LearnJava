import java.util.Random;

public class Hello {
    public static void main(String[] args) {
        //這個是沒有省略的寫法
        UseInter((String msg) -> {
            return msg;
        });

        //省略的寫法
        //可以省略參數型別
        //因只有一個參數,所以()省略
        //因方法體只有一行所以可以省略{}跟結尾的;
        //因這個function有回傳值,且因為上面的條件省略{},return也可以省略不寫
        UseInter(msg -> msg + "省略的寫法");

    }

    public static void UseInter(inter i){
        System.out.println(i.ShowMsg("123"));
    }

}

//如果Interface中只有一個function需要被實現的話,
//就可以被稱為函數式編程接口
@FunctionalInterface
interface inter{
    String ShowMsg(String msg);
}
