package com.example.demo.Prototype;

import java.util.List;

public class PrototypeImpl {
    public static void main(String[] args) throws CloneNotSupportedException{
        PrototypePattern p1 = new PrototypePattern();
        p1.loadData();

        //now we will use the clone method we have overridden we used in the main class
        PrototypePattern p2 = (PrototypePattern) p1.clone();
        List<Integer> newLis = p2.getTypeOfComp();
        newLis.add(6969);

        System.out.println(p1.getTypeOfComp());
        System.out.println(p2.getTypeOfComp());
    }
}
