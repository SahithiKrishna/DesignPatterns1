package com.example.demo.AbstractFactory;


//Abstract Factory design pattern provides approach to code for interface rather than implementation.
//Abstract Factory pattern is “factory of factories” and can be easily extended to accommodate more products, for example we can add another sub-class Laptop and a factory LaptopFactory.
//Abstract Factory pattern is robust and avoid conditional logic of Factory pattern
public abstract class Computer {
    public abstract String getRam();
    public abstract String getMemory();

    public String toString(){
        return "Ram: "+this.getRam()+" Memory: "+this.getMemory();
    }
}
