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
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Controller ctr = new Controller();
        CarSpec spec = ctr.addCarSpecification("Mercedes", "Benz", 2016, Size.MIDSIZE);
        ctr.addCar("1", spec);
        
        LinkedList<Car> cars = ctr.getAllCars();
        for(Car c : cars){
            System.out.println(c.getCarSpec().getCarSize());
        }
        
        
        
        
    }
    
}
