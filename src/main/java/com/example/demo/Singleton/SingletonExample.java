package com.example.demo.Singleton;

//The main purpose of this design pattern
//Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the Java Virtual Machine.
// The singleton class must provide a global access point to get the instance of the class.
//Singleton pattern is used for logging, drivers objects, caching, and thread pool.
public class SingletonExample {
    private static SingletonExample instance;

    //Eager initialization
   //private static SingletonExample instance = new SingletonExample();

    private SingletonExample(){

    }
    private int value = 1;

    //Thread safe implementation
    public static SingletonExample getInstance(){
        if(instance==null) {
            synchronized (SingletonExample.class){
                if(instance==null)
                    instance = new SingletonExample();
            }
        }
        return instance;
    }

    //Lazy loading implementation
//    public static SingletonExample getInstance(){
//        if(instance==null)
//           instance = new SingletonExample();
//        }
//        return instance;
//    }

    //Eager implementation
//     public static SingletonExample getInstance(){
//        return instance;
//     }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
