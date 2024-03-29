package com.example.demo;

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
