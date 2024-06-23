package Test3;

public class OverseaOrder implements OrderService {
    @Override
    public void Create() {
        System.out.println("Oversea Create");
    }

    @Override
    public void FindOne() {
        System.out.println("Oversea FindOne");
    }
}
