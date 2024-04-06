package com.example.demo.Decorator;


//Decorator pattern is used when the functionality of an object needs to be modified during the runtime
//At the same time the other instances of the class will not be affected, so every individual object gets a different behaviour
//The drawback of this pattern is it used a lot of similar kind of objects
public class DecoratorImpl {
    public static void main(String[] args){
        INotifier notifier = new FacebookNotifierDecorator(new WhatsappDecorator(new Notifier("sahithi")));

        notifier.send("sending this offer");

        INotifier onlyfb = new FacebookNotifierDecorator(new Notifier("Rohit"));

        onlyfb.send("fb offer");
    }
}
