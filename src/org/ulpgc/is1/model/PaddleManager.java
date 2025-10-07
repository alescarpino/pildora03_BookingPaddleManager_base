package org.ulpgc.is1.model;

import java.util.ArrayList;

public class PaddleManager {
    public ArrayList<Customer> customers;
    public PaddleManager(){
        customers = new ArrayList<>();
    }
    public Customer getCustomer(int i){
        return customers.get(i);
    }

    public void addCustomer(String name, String sur, String address, int i, int i1, String city) {
    Customer c = new Customer(name,sur,address,i,i1,city);
    customers.add(c);
    }
}
