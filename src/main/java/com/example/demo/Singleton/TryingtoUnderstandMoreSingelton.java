package com.example.demo.Singleton;

import com.example.demo.Singleton.SingletonExample;

public class TryingtoUnderstandMoreSingelton {

    public static void main(String[] args){
        SingletonExample singletonExample = SingletonExample.getInstance();
        System.out.println(singletonExample.getValue());
        singletonExample.setValue(3);
        SingletonExample singletonExample1 = SingletonExample.getInstance();
        System.out.println(singletonExample1.getValue());
        System.out.println(singletonExample1.equals(singletonExample));
    }
}
