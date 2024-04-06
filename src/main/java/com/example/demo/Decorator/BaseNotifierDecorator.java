package com.example.demo.Decorator;

public abstract class BaseNotifierDecorator implements INotifier {
    private final INotifier iNotifier;
    protected final DatabaseService databaseService;

    BaseNotifierDecorator(INotifier wrapped){
        this.iNotifier = wrapped;
        this.databaseService = new DatabaseService();
    }

    public void send(String msg){
        iNotifier.send(msg);
    }

    public String getUserName(){
        return iNotifier.getUserName();
    }
}
