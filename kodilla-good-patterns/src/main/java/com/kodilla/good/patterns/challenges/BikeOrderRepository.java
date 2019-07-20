package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class BikeOrderRepository implements OrderRepository {
    public void createOrder(User user, LocalDateTime createDateTime) {
        System.out.println("Bike order saved in Repository at " + createDateTime + " for user " + user.getUserID());
    }
}
