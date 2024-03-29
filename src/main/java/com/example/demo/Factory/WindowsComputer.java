package com.example.demo.Factory;

public class WindowsComputer extends Computer{
    private String ram;
    private String memory;

    WindowsComputer(String ram, String memory){
        this.memory = memory;
        this.ram = ram;
    }

    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getMemory() {
        return this.memory;
    }
}
