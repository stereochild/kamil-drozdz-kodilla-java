package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predictors.ConservativePredictor;

public class IndyvidualCustomer extends Customer {
    public IndyvidualCustomer(String name) {
        super(name);
        this.buyPredictor = new ConservativePredictor();
    }
}
