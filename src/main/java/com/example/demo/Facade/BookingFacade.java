package com.example.demo.Facade;

public class BookingFacade {
    public void createBooking(User user){
        TicketBookingSystem ts = new TicketBookingSystem(123);
        PaymentBooking pb = new PaymentBooking();
        NotificationSystem ns = new NotificationSystem();

        boolean isBookingValid = ts.validateMovieAvailability("dookudu");
        if(isBookingValid){
            ts.createTicket(user,"dookudu");
            pb.takePayment(ts.getTicketNo());
            ns.sendEmail(user,ts.getTicketNo());
        }
    }
}
