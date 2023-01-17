package ex08.push.pub;

import java.util.ArrayList;
import java.util.List;

import ex08.push.sub.Customer;

public class LotteMart implements Mart{

    private List<Customer> customerList = new ArrayList<>();

    @Override
    public void add(Customer customer) {
        customerList.add(customer);        
    }

    @Override
    public void recevied() {
        try {
            for(int i =0; i < 5; i++){
                System.out.println(".");
                Thread.sleep(1000);
            }
            notifyChange("LotteMart 상품 입고");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    @Override
    public void remove(Customer customer) {
        customerList.remove(customer);        
        
    }

    @Override
    public void notifyChange(String msg) {
        customerList.forEach((c) ->{
            c.update(msg);
        });
        
    }
    
}
