package com.kodilla.good.patterns.challenges.ishop;

public class ProductOrderRepository implements OrderRepository {

    @Override
    public boolean createOrder(User user, Product product) {
        return true;
    }
}
