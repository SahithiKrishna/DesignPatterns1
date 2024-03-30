package com.example.demo.AbstractFactory;

public class FactoryImpl {
    public static void main(String[] args){
        Computer mac = ComputerFactory.getComputer(new MacComputerFactory("18GB", "512GB"));
        Computer windows = ComputerFactory.getComputer(new WindowsComputerFactory("64GB","1TB"));
        System.out.println("MAC: "+mac.toString());
        System.out.println("Winodws: "+windows.toString());
    }
}
