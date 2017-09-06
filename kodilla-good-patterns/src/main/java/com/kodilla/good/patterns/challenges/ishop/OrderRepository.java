package com.kodilla.good.patterns.challenges.ishop;

public interface OrderRepository {
    boolean createOrder(User user, Product product);
}
