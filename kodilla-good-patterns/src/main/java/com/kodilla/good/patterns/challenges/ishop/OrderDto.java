package com.kodilla.good.patterns.challenges.ishop;

public class OrderDto {
    public User user;
    public boolean isOrder;

    public OrderDto(final User user, final boolean isOrder) {
        this.user = user;
        this.isOrder = isOrder;
    }

    public User getUser() {return user;}
    public boolean isOrder() {return isOrder;}
}
