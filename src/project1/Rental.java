/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
        this.rentalId =  rentalId;
    }
    
    public String getRentDate(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        return  dateFormat.format(rentDate.getTime()); //2014/08/06 16:00:22
        
    }
    public String getReturnDate(){
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        return  dateFormat.format(returnDate.getTime()); //2014/08/06 16:00:22
        
    }
    
    public String getCarId(){
        return  carId;
    } 
    public String getCustomerId(){
        return customerId; 
    }
    
        
    
    
}
