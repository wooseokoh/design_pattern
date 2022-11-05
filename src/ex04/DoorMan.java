package ex04;

public class DoorMan {

    // java에서 static은 main method를 호출하기 전에 jvm이 읽어서 메모리에 올라오는 것
    private static DoorMan doorMan = new DoorMan();

    public static DoorMan getInstance() { // heap이 관리하는 메소드
        return doorMan;
    }

    private DoorMan() {
    }

    public void 쫒아내(Animal a) {
        System.out.println(a.getName() + " 쫒아내");
    }
}
