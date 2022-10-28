import ex03.Cat;
import ex03.DoorMan;
import ex03.Mouse;
import ex03.OuterTiger;
import ex03.TigerAdepter;
import ex03.DoorManProxy;

public class App {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Cat c = new Cat();
        TigerAdepter ot = new TigerAdepter(new OuterTiger());
        DoorManProxy dm = new DoorManProxy(new DoorMan());
        dm.쫒아내(m);
        dm.쫒아내(c);
        dm.쫒아내(ot);
    }
}
