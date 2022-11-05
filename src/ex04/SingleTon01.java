// 멀티스레드에 취약
// 순서 보장 x
public class SingleTon01 {
    private static SingleTon instance;

    private SingleTon(){}

    public static SingleTon getInstance() {
        if(instance == null){
            instance = new SingleTon()
        }
        return instance;
    }
}

// 예시
public class Dog() {
    private static String dog = "푸들";

    public static void main(String[] args){
        Dog a = new Dog();
        new Thread(() -> {
            for (int i = 0; i < 10; i++){
                a.say("멍멍");
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++){
                a.say("야옹");
            }
        }).start();
    }
    
}

public void say(String sound){
    dog = sound;
    try {
        long sleep = (long) (Math.random() * 100);
        Thread.sleep(sleep);
    } catch (InterruptedException e) {
        e.printStachTrace();
    }
    if(!dog.equals(sound)){
        System.out.println(sound + " | " + dog);
    }
}