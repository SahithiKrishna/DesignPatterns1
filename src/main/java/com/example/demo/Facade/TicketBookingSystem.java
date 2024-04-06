package com.example.demo.Facade;

public class TicketBookingSystem {
    private int ticketNo;
    public TicketBookingSystem(int ticketNo){
        this.ticketNo = ticketNo;
    }
    public boolean validateMovieAvailability(String movie){
        if(movie.equalsIgnoreCase("dookudu"))
            return true;
        return false;
    }

    public void createTicket(User user, String movie){
        System.out.println("creating ticket "+ticketNo+ " for user"+user.toString()+" for movie "+movie);
    }

    public int getTicketNo(){
        return this.ticketNo;
    }
}
