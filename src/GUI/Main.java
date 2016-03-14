/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import project1.CarSpec;
import project1.Controller;
import project1.Size;

/**
 *
 * @author Ana-1
 */
public class Main {
   
    public static void main(String []args){
        Controller c = Controller.instance();
        Customers cust = new Customers(c);
        cust.setVisible(true);
        c.addCustomer("123","Anas", "1021");
        c.addCustomer("321","Mourad", "0211");
        c.addCustomer("56","A", "2110");
        c.addCustomer("816","M", "1102");
        
        c.addCarSpecification("1", "Toyota", "pri", 2016, Size.MIDSIZE);
        c.addCarSpecification("2", "BMW", "series 5", 2016, Size.MIDSIZE);
        
        c.addCar("1", "id1");
        c.addCar("2", "id2");
        
    }
    
}
