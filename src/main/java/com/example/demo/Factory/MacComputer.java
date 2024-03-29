package com.example.demo.Factory;

public class MacComputer extends Computer{
    private String ram;
    private String memory;

    MacComputer(String ram, String memory){
        this.ram = ram;
        this.memory = memory;
    }

    public String getRam(){
        return this.ram;
    }

    public String getMemory(){
        return this.memory;
    }
}
