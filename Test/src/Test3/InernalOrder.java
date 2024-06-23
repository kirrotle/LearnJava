package Test3;

public class InernalOrder implements OrderService {
    @Override
    public void Create() {
        System.out.println("Internal Create");
    }

    @Override
    public void FindOne() {
        System.out.println("Internal Find One");
    }
}
