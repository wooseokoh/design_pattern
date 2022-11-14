// package ex04_01;
// // synchronized
// // 스레드가 해당 메서드 호출시에 다른 스레드가 접근하지 못하도록 lock.
// public class SingleTon02 {
//     private static SingleTon instance;

//     private SingleTon(){}

//     public static synchronized SingleTon getInstance() {
//         if(instance == null){
//             instance = new SingleTon()
//         }
//         return instance;
//     }
// }

// // 예시
// public class Dog() {
//     private static String dog = "푸들";

//     public static void main(String[] args){
//         Dog a = new Dog();
//         new Thread(() -> {
//             for (int i = 0; i < 10; i++){
//                 a.say("멍멍");
//             }
//         }).start();

//         new Thread(() -> {
//             for (int i = 0; i < 10; i++){
//                 a.say("야옹");
//             }
//         }).start();
//     }
    
// }

// public synchronized void say(String sound){
//     dog = sound;
//     try {
//         long sleep = (long) (Math.random() * 100);
//         Thread.sleep(sleep);
//     } catch (InterruptedException e) {
//         e.printStachTrace();
//     }
//     if(!dog.equals(sound)){
//         System.out.println(sound + " | " + dog);
//     }
// }