package com.example.demo.Adapter;

//This design pattern comes under structural design pattern
//This is used when we want two unrelated interfaces to work together
//An adapter class is used to join these two interfaces together
//There are two ways to implement this pattern Class Adapter and Object adapater
public class AdapterImpl {
    public static void main(String[] args){

        //Class Adapter implementation
        SocketAdapter socketAdapterClass = new SocketClassAdapterImpl();
        System.out.println(socketAdapterClass.get3Volt());
        System.out.println(socketAdapterClass.get12Volt());
        System.out.println(socketAdapterClass.get120Volt());

        //Object Adapter Implementation
        SocketAdapter socketAdapterObject = new SocketObjectAdapterImpl();
        System.out.println(socketAdapterObject.get120Volt());
        System.out.println(socketAdapterObject.get12Volt());
        System.out.println(socketAdapterObject.get3Volt());
    }
}
