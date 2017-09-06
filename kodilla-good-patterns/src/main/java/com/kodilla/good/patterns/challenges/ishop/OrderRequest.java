package com.kodilla.good.patterns.challenges.ishop;

public class OrderRequest {
    private final User user;
    private final Product product;
    private final Invoice invoice;

    public OrderRequest(final User user, final Product product, final Invoice invoice) {
        this.user = user;
        this.product = product;
        this.invoice = invoice;
    }

    public User getUser() {return user;}

    public Product getProduct() {return product;}

    public Invoice getInvoice() {return invoice;}

    @Override
    public String toString() {
        return "OrderRequest{" +
                "user=" + user +
                ", product=" + product +
                ", invoice=" + invoice +
                '}';
    }
}

