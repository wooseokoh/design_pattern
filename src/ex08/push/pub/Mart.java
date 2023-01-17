package ex08.push.pub;

import ex08.push.sub.Customer;

public interface Mart {

    void add(Customer customer);

    void recevied();

    void remove(Customer customer);

    void notifyChange(String msg);
}
