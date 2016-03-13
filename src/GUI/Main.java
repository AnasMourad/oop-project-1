/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import project1.Controller;

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
        
    }
    
}
