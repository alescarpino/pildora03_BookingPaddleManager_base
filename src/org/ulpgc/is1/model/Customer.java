package org.ulpgc.is1.model;

public class Customer {
    public String name;
    public String surname;
    public String address;
    public int civico;
    public int cap;
    public String city;



    public Customer(String n, String su, String add, int c, int ca, String cit){
        this.name=n;
        this.surname =su;
        this.address=add;
        this.civico=c;
        this.cap= ca;
        this.city=cit;
    }
}
