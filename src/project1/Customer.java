/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.LinkedList;

/**
 *
 * @author Ana-1
 */
public class Customer {
    
    private String phone, name, address;
    LinkedList<String> rentals;
    public Customer(String phone, String name, String address) {
        
        this.address = address;
        this.name = name;
        this.phone  = phone;
        rentals = new LinkedList<>();
        
    }
    
    public void rentCar (String orderId){
        rentals.add(orderId);
    }
    
    public String getPhone(){
       return phone;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public boolean contains(String data){
        return name.toLowerCase().contains(data.toLowerCase()) || phone.toLowerCase().contains(data.toLowerCase()) || address.toLowerCase().contains(data.toLowerCase());
    }
    
}
