package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRquest {
    private User user;
 //   private Product product;
    private LocalDateTime orderCreateDateTime;

    public OrderRquest(final User user, final LocalDateTime orderCreateDateTime) {
        this.user = user;
        this.orderCreateDateTime = orderCreateDateTime;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderCreateDateTime() {
        return orderCreateDateTime;
    }
}
