package com.example.demo;

public class TryingtoUnderstandSingleton {

    public static void  main(String[] args){
         SingletonExample singletonExample = SingletonExample.getInstance();
         System.out.println(singletonExample.getValue());
         singletonExample.setValue(2);

         //so here the value in singleton class is set to 1, when you set the value to 2 and create a new instance and retrieve the value there it is still considered as 2.
    }

}
