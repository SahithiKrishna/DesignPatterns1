package com.example.demo.Flyweight;

import java.util.AbstractMap;
import java.util.Map;

//Basically this pattern is used when there is too much data while creating a class and it takes lot of time while creating a object and heavy on memory
//Before applying this pattern we should consider that the object properties should be extrinsic or intrinsic
//intrinsic properties are those that make the object unique and can be common across the objects
//extrinsic properties are something that client would have to initiate
public class FlyweightImpl {

    private static final String colors[] = {"Red","Yellow","Blue"};
    private static final Map<String, Integer> colorMap = Map.ofEntries(
            new AbstractMap.SimpleEntry<String,Integer>("Red",3),
            new AbstractMap.SimpleEntry<String, Integer>("Yellow",4),
            new AbstractMap.SimpleEntry<String,Integer>("Blue",5)
        );
    public static void main(String[] args){
        for(int i = 0; i<10 ;i++){
            String color = getColor();
            Ball ball = BallFactory.getBall(color,colorMap.get(color));
            ball.setX(getX());
            ball.setY(getY());
            ball.draw();
            System.out.println(ball.hashCode());
        }
    }

    private static String getColor(){
        return colors[(int)(Math
                .random()* colors.length)];
    }

    private static int getX(){
        return (int)(Math.random()*50);
    }

    private static int getY(){
        return (int)(Math.random()*50);
    }
}
