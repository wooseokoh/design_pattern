package ex08.push;

import ex08.push.pub.Emart;
import ex08.push.pub.LotteMart;
import ex08.push.pub.Mart;
import ex08.push.sub.Cus1;
import ex08.push.sub.Cus2;
import ex08.push.sub.Cus3;
import ex08.push.sub.Customer;

public class App {

    public static void main(String[] args) {
        Mart lotteMart = new LotteMart();
        Mart eMart = new Emart();
        Customer cus1 = new Cus1();
        Customer cus2 = new Cus2();
        Customer cus3 = new Cus3();

        lotteMart.add(cus1);
        lotteMart.add(cus2);
        lotteMart.add(cus3);

        eMart.add(cus1);
        eMart.add(cus2);

        lotteMart.remove(cus2);
        
        new Thread(()->{
            lotteMart.recevied();
        }).start();
    
        new Thread(()->{
            eMart.recevied();
        }).start();
    }
    
}
