package com.example.demo.Flyweight;

import java.util.HashMap;

public class BallFactory {
    private static final HashMap<String, Ball> ballMap = new HashMap<String, Ball>();

    public static Ball getBall(String color, int diameter) {
        StringBuilder sb = new StringBuilder();
        sb.append(color);
        sb.append(diameter);
        String ballCacheKey  = sb.toString();
        Ball ball  = ballMap.get(ballCacheKey);

        if(ball == null){
            ball = new Ball(color, diameter);
            ballMap.put(ballCacheKey,ball);
            System.out.println("Creating circle of color: "+color);
        }
        return ball;
    }
}
