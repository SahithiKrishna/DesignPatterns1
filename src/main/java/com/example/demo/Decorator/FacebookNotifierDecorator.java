package com.example.demo.Decorator;

public class FacebookNotifierDecorator extends BaseNotifierDecorator {

    public FacebookNotifierDecorator(INotifier iNotifier){
        super(iNotifier);
    }
    @Override
    public void send(String msg) {
        super.send(msg);
        System.out.println("sending "+msg+" on facebook to "+databaseService.getFBNameFromUsername(getUserName()));
    }
}
