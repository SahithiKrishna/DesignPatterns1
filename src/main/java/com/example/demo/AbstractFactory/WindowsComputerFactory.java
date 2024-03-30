package com.example.demo.AbstractFactory;

public class WindowsComputerFactory implements ComputerAbstractFactory{

    private String ram;

    private String memory;

    public WindowsComputerFactory(String ram, String memory){
        this.memory = memory;
        this.ram = ram;
    }

    @Override
    public Computer getComputer() {
        return new WindowsComputer(ram, memory);
    }
}
