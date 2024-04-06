package com.example.demo.Decorator;

public class WhatsappDecorator extends BaseNotifierDecorator{
    public WhatsappDecorator(INotifier iNotifier){
        super(iNotifier);
    }

    public void send(String msg){
        super.send(msg);
        System.out.println("sending "+msg+" on whatsapp for "+databaseService.getPhoneNbrFromUsername(getUserName()));
    }
}
