package ex08.polling;

public class App {
    public static void main(String[] args) {
        LotteMart lotteMart = new LotteMart();
        Customer1 customer1 = new Customer1();
        Customer2 customer2 = new Customer2();

        new Thread(() -> {
            lotteMart.recevied();
        }).start();
        
        while(true){
            try {
                System.out.println("상품들어왔나요?");
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            if(lotteMart.getValue() != null){
                customer1.update(lotteMart.getValue() + "이 들어왔습니다.");
                customer2.update(lotteMart.getValue() + "이 들어왔습니다.");
                break;
            }else{
                System.out.println("상품이 아직 들어오지 않았습니다.");
            }
        }
    }
    
}
