package com.example.demo.AbstractFactory;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory submodel){
        return submodel.getComputer();
    }
}
