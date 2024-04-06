package com.example.demo.Facade;

public class NotificationSystem {

    public void sendEmail(User user, int ticketNo){
        System.out.println("sending email for ticketNo "+ticketNo+ " to user "+user.toString());
    }
}
