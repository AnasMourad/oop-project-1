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
public class CarSpec {
    private String make;
    private String model;
    private int year;
    private Size carSize;
    
    public CarSpec(String make, String model, int year, Size carSize){
    
        this.make = make;
        this.model = model;
        this.year = year;
        this.carSize = carSize;
    
    }
    
    public String getMake(){
        
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public Size getCarSize(){
        return carSize;
    }
    
        
}