/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.Calendar;

/**
 *
 * @author Ana-1
 */
public class Rental {
  private Calendar rentDate, returnDate;
  private String customerId, carId;   
  private String rentalId;
    Status rentalStatus;
    public Rental(Calendar rentDate, Calendar returnDate, String carId, String customerId, String rentalId){
        this.carId = carId;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.customerId = customerId;
        this.rentalStatus = Status.RENTED;
        this.rentalId =  rentalId;
    }
    
    public Calendar getRentDate(){
        return rentDate;
    }
    public Calendar getReturnDate(){
        return  returnDate;                
    }
    
    public String getCarId(){
        return  carId;
    } 
    public String getCustomerId(){
        return customerId; 
    }
    
        
    
    
}
