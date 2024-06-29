public class Hello {//這個是Class Block
    public static void main(String[] args) {//這個是Method Block
        {//這個是Local Block
            int x = 10;
            System.out.println(x);
        }
        //因上面的x出大括號之後被釋放了
        //所以下面可以再宣告一個x
        int x = 20;
        System.out.println(x);
    }
}
