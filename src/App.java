import ex04.Cat;
import ex04.DoorMan;

public class App {
    public static void main(String[] args) {

        DoorMan doorMan = DoorMan.getInstance();
        doorMan.쫒아내(new Cat());
    }
}
