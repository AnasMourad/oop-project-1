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
    private Car car;
    private Customer customer;
    private Status rentalStatus;
    
    public Rental(Calendar rentDate, Calendar returnDate, Car car, Customer customer, Status rentaStatus){
        this.car = car;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.customer = customer;
        this.rentalStatus = rentalStatus;
    }
    
    public Calendar getRentDate(){
        return rentDate;
    }
    public Calendar getReturnDate(){
        return  returnDate;                
    }
    
    public Car getCar(){
        return  car;
    } 
    public Customer getCustomer(){
        return customer; 
    }
    public Status getRentalStatus(){
        return rentalStatus;
    }
        
    
    
}
