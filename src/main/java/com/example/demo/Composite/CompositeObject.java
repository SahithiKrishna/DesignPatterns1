package com.example.demo.Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeObject {
    private List<Shape> shapeList = new ArrayList<>();

    public void draw(String color){
        for(Shape sh: shapeList){
            sh.draw(color);
        }
    }

    public void add(Shape s){
        shapeList.add(s);
    }
    public void remove(Shape s){
        shapeList.remove(s);
    }

    public void clear(){
        System.out.println("clearing all the shapes from drawing");
        this.shapeList.clear();
    }
}
