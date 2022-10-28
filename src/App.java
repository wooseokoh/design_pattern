import ex01.Cat;
import ex01.DoorMan;
import ex01.Mouse;

public class App {
    public static void main(String[] args) throws Exception {
        Mouse m = new Mouse();
        Cat c = new Cat();
        DoorMan dm = new DoorMan();
        dm.쫒아내(m);
        dm.쫒아내(c);
    }
}
