// package ex04_01;
// // synchronized - lock으로 인한 딜레이
// // 정적 맴버를 사용하여 최초에 jvm 클래스 로딩 때 미리 인스턴스 생성
// // 정적 맴버의 경우 자원낭비 문제점 있음.
// public class SingleTon03 {
//     private final static SingleTon instance = new SingleTon();

//     private SingleTon(){}

//     public static SingleTon getInstance() {
//         return instance;
//     }
// }

// // 정적 블록
// public class SingleTon03 {
//     private static SingleTon instance = null

//     static{
//         instance = new SingleTon();
//     }

//     private SingleTon(){}

//     public static SingleTon getInstance() {
//         return instance;
//     }
// }