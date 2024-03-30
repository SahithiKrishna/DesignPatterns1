package com.example.demo.AbstractFactory;

public class WindowsComputer extends Computer{
    private String ram;
    private String memory;

    public WindowsComputer(String ram, String memory) {
        this.memory = memory;
        this.ram = ram;
    }

    public String getRam(){
        return this.ram;
    }
    public String getMemory(){
        return this.memory;
    }

}
