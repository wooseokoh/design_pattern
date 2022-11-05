// 정적맴버와 lazy holder(중첩 클래스)
// 최초에 초기화 되지 않고 getInstance가 호출될때 로딩되어 인스턴스를 생성.
class SingleTon04 {
    private static class singleInstanceHolder{
        private static SingleTon INSTANCE= new SingleTon();
    }

    public static SingleTon getInstance() {
        return singleInstanceHolder.INSTANCE;
    }
}