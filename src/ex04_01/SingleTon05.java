// package ex04_01;
// // DCL
// // 인스턴스 생성 여부를 싱글톤 패턴 잠근전에 한번 객체를 생성하기 전에 한 번 체크하여
// // 2번 체크하면 인스턴스가 존재하지 않을때만 잠금을 걸수 있다.
// // volatile - 메인 메모리로 부터 변수를 기반으로 가져옴 (메인-> 캐시메모리 x, 메인 -> 바로)
// public class SingleTon05 {
//     private volatile SingleTon instance;

//     private SingleTon(){}

//     public SingleTon getInstance() {
//         if(instance == null){
//             synchronized (SingleTon05.class){
//                 if(instance == null){
//                     instance = new SingleTon()
//                 }
//             }
//         }
//         return instance;
//     }
// }
