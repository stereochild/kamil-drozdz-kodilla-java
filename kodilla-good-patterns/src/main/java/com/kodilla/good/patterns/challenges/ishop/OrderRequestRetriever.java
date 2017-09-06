package com.kodilla.good.patterns.challenges.ishop;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){

        User user = new User("John", "Wick", "johnwick_ed@hotmail.com", "PostalBox 132, New York Post Office 143", 123);
        Product product = new Product("Batman v Superman: Dawn of Justice Batman Action Figure", 16.99);

        return new OrderRequest(user, 12, product, 1,16.99);
    }
}
