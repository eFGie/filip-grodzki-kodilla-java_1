package com.kodilla.good.patterns.challenges;

public class OrderDto {

    private User user;
    private boolean isBought;

    public OrderDto(final User user, final boolean isBought) {
        this.user = user;
        this.isBought = isBought;
    }

    public User getUser() {
        return user;
    }

    public boolean isBought() {
        return isBought;
    }
}
