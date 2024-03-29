package com.example.demo.Factory;


//here interface can also be used but although all the subclassed would definitely have these features so abstract class would be a better option
//Say you have additional constraint for your computer, say its OS specific you can have many features in an interface and implement that particular one
public abstract class Computer {
    public abstract String getRam();
    public abstract String getMemory();

    public String toString(){
        return "RAM="+getRam()+" Memory="+getMemory();
    }
}
