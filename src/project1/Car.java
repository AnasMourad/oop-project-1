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
public class Car {
  
    public enum carStatus {
 
        AVAILABLE, NOTAVAILABLE;
    
    }
    carStatus carstatus;
    
    
    private String id;
    private CarSpec spec;
    public Car(CarSpec spec, String id){
        
        carstatus = carStatus.AVAILABLE;
        this.id = id;
        this.spec = spec;

    }
    public CarSpec getCarSpec(){
        return spec;
    }
    public String getId(){
        return id;
        
    }
    
    public boolean include(String data){
        
        return spec.getModel().toLowerCase().contains(data.toLowerCase()) || spec.getMake().toLowerCase().contains(data.toLowerCase());
    }

}
