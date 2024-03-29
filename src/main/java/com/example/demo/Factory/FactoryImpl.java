package com.example.demo.Factory;

//Basically we have multiple subclasses and we need to return only one based upon the arguments
//The client program need not instantiate a class
//The main advantage for this pattern is to implement the desired subclass based upon the arguments you have given that there is only one implementation of that interface
public class FactoryImpl {
    public static void main(String[] args){
        Computer mac = ComputerFactory.getComputer("Mac","16GB","1TB");
        Computer windows = ComputerFactory.getComputer("Windows","64GB","512GB");
        System.out.println("For MAC: "+mac.toString());
        System.out.println("For Windows: "+windows.toString());
    }
}
