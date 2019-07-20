package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRquest retrieve() {

        User user = new User(1001, "userFirstName_1001","userSurName_1001","userEmail_1001");

        LocalDateTime orderCreateDateTime  = LocalDateTime.now();

        return new OrderRquest(user,orderCreateDateTime);
    }
}
