package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class BikeOrderService implements ProductOrderService {
    public boolean order (User user, LocalDateTime orderCreateDatetime){
        System.out.println("Bike order created for user " + user.getUserID() + " at " + orderCreateDatetime);
        return  true;
    }
}
