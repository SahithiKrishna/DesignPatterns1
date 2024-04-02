package com.example.demo.Composite;


//This design pattern is mainly used when a group of objects has to behave in the same way, basically inherit the same properties
//and any action is also applied across all the objects
//This is mainly divided into 3 parts - Base Component, Leaf Objects and the Composite class which implements the operations of Base Component on the leaf objects.
public class CompositeImpl {
    public static void main(String[] args){
        Shape cir = new CircleShape();
        Shape tri = new TriangleShape();
        CompositeObject compositeObject = new CompositeObject();
        compositeObject.add(cir);
        compositeObject.add(tri);

        compositeObject.draw("purple");

        compositeObject.clear();

        compositeObject.add(tri);

    }
}
