package ex08.polling;

public class LotteMart {
    private String value = null;

    public String getValue(){
        return value;
    }

    public void recevied() {
        try {
            for(int i =0; i < 5; i++){
                Thread.sleep(1000);
            }
            value = "상품";
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    
}