/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Ana-1
 */
public class Controller {
        
        
    public enum Add {

        SUCCESS, KEYEXISTS, FAILURE
    };
      private static Controller singleton;
    
      private Map<String ,CarSpec> carSpecifications;
      private Map<String, Car> cars;
      private Map<String, Customer> customers;
      private Map<String, Rental> rentals;
      
      public static Controller instance() {
        if (singleton == null) {
            singleton = new Controller(0);
        }
        return singleton;
    }
      
    protected Controller() throws Exception {
        if(getClass().getName().equals("Controller")){
            throw new Exception();
        }
    }

    private Controller(int i) {
        customers = new HashMap();
        cars = new HashMap();
        carSpecifications = new HashMap();
        rentals = new HashMap();
    }
      
      
      public Add addCarSpecification(String specId, String make, String model, int year, Size carSize){
          
        if (carSpecifications.containsKey(specId)) {
            return Add.KEYEXISTS;
        
        } else {
            carSpecifications.put(specId, new CarSpec(specId, make, model, year, carSize));
        }
        return Add.SUCCESS;
      }
      
      public Add addCar(String id, CarSpec spec){
          if(cars.containsKey(id)){
              return Add.KEYEXISTS;
              
          }else{
              
              cars.put(id, new Car(id, spec));
          }
          return Add.SUCCESS;
          
      }
      
      public Add addCustomer(String phone, String name, String address){
          //Assumption: use the phone as PRIMKEY
          if(customers.containsKey(phone)){
              return Add.FAILURE;
          }else{
              
              customers.put(phone,new Customer(phone, name, address)); 
          }
          return Add.SUCCESS;
          
      }
      public void addRental (Calendar rentDate, Calendar returnDate, String carId, String customerId){
        
          
          Customer customer = customers.get(customerId);
          Car car = cars.get(carId);
          //not handled car availability
          String rentalId = customerId+carId; 
          Rental rental = new Rental(rentDate, returnDate, carId, customerId, rentalId);
          customer.rentCar(rentalId);
          
          
      }
      public Object [][] customersSearch(String query){
            
          Collection<Customer> customers = this.customers.values().stream()
                                               .filter(item->item.contains(query))
                                               .collect(Collectors.toList());
            Object[][] result = new Object[customers.size()][3];
            int count = 0;
            for (Customer customer : customers) {
                Object[] cus_array = {customer.getPhone(),  customer.getName(), customer.getAddress()};
                result[count++] = cus_array;
            }
       
            return result;
      }
      public String getCustomerName(String CustomerId){
         return customers.get(CustomerId).getName();
      }
      
}
