import java.util.Random;

public class Hello {
    public static void main(String[] args) {

        UseInter(new inter() {
            @Override
            public String ShowMsg(String msg) {
                return "Anonymous Inner Class";
            }
        });

        UseInter(msg -> msg + "Lambda");

    }

    public static void UseInter(inter i){
        System.out.println(i.ShowMsg("123"));
    }

}

@FunctionalInterface
interface inter{
    String ShowMsg(String msg);
}
