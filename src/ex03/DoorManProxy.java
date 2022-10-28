package ex03;

public class DoorManProxy {

    // 컴퍼지션
    private DoorMan doorMan;

    public DoorManProxy(DoorMan doorMan) {
        this.doorMan = doorMan;
    }

    public void 쫒아내(Animal a) {
        System.out.println("안녕");
        doorMan.쫒아내(a);
    }
}
