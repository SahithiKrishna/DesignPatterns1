package com.example.demo.AbstractFactory;

import javax.crypto.Mac;

public class MacComputerFactory implements ComputerAbstractFactory{

    private String ram;
    private String memory;

    MacComputerFactory(String ram, String memory){
        this.ram = ram;
        this.memory = memory;
    }
    @Override
    public Computer getComputer() {
        return new MacComputer(ram,memory);
    }
}
