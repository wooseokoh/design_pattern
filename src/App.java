import ex02.Cat;
import ex02.DoorMan;
import ex02.Mouse;
import ex02.DoorManProxy;

public class App {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Cat c = new Cat();
        DoorManProxy dm = new DoorManProxy(new DoorMan());
        dm.쫒아내(m);
        dm.쫒아내(c);
    }
}
