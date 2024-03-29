package com.example.demo.Factory;

public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String memory){
        if(type.equalsIgnoreCase("mac"))
            return new WindowsComputer(ram, memory);
        if(type.equalsIgnoreCase("windows"))
            return new MacComputer(ram,memory);
        return null;
    }
}
