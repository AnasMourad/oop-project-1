/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author Ana-1
 */
public class Customer {
    private String phone, name, address;
    public Customer(String phone, String name, String address) {
        
        this.address = address;
        this.name = name;
        this.phone  = phone;
        
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
    
}
