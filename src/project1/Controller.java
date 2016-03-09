/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.Calendar;
import java.util.LinkedList;

/**
 *
 * @author Ana-1
 */
public class Controller {
    
      private LinkedList<CarSpec> carSpecifications = new LinkedList<>();
      private LinkedList<Car> cars = new LinkedList<>();
      private LinkedList<Customer> customers = new LinkedList<>();
      private LinkedList<Rental> rentals = new LinkedList<>();
      
      public CarSpec addCarSpecification(String make, String model, int year, Size carSize){
          CarSpec specification = new CarSpec(make, model, year, carSize);
          carSpecifications.add(specification);
          return  specification;
      }
      public void addCar(String id, CarSpec spec){
          Car car = new Car(id, spec);
          cars.add(car);
      }
      public void addCustomer(String phone, String name, String address){
          
          Customer customer = new Customer(phone, name, address);
          customers.add(customer);
          
      }
      public void addRental (Calendar rentDate, Calendar returnDate, Car car, Customer customer, Status rentaStatus){
        Rental rental = new Rental(rentDate, returnDate, car, customer, rentaStatus);
        rentals.add(rental);
      } 
      LinkedList<Car> getAllCars(){
          return cars;
                  
      }
      
}
