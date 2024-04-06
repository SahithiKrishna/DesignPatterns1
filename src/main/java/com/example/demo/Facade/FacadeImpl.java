package com.example.demo.Facade;

//Basically Facade class acts as a face of all the classes which have different functionality
//Client need not initiate all of these classes individually and instead can call the facade class with the required parameters
public class FacadeImpl {
    public static void main(String[] args) {
        BookingFacade bf = new BookingFacade();
        bf.createBooking(new User("Sahithi", "8919085526"));
    }
}
