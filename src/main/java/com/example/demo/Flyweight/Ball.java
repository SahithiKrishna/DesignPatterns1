package com.example.demo.Flyweight;

public class Ball {
    private String color;
    private int diameter;

    private int X;
    private int Y;

    public Ball(String color, int diamter){
        this.color = color;
        this.diameter = diamter;
    }
    public void setX(int X){
        this.X = X;
    }

    public void setY(int Y){
        this.Y = Y;
    }

    public void draw(){

    }
}
