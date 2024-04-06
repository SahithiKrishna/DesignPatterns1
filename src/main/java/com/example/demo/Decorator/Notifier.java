package com.example.demo.Decorator;

public class Notifier implements INotifier{

    private final String username;
    private final DatabaseService databaseService;

    public Notifier(String username){
        this.username = username;
        databaseService = new DatabaseService();
    }
    public void send(String message){
        String mail = databaseService.getMailFromUsername(username);
        System.out.println("sending email message "+message +" for: "+mail);
    }


    public String getUserName(){
        return this.username;
    }
}
