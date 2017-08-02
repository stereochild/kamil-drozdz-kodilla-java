package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
     //example test

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println(("test OK"));
        } else {
            System.out.println(("Error!"));
        }


    // calculator test

        Calculator simpleCalculator = new Calculator();

        int add = simpleCalculator.addAToB(10, 10);
        int predictedSum = 20;

        if (add == predictedSum) {
            System.out.println("test OK");
        } else {
            System.out.println("ERROR!");
        }

        int susbtract = simpleCalculator.substractBFromA(10, 10);
        int predictedDifference = 0;

        if (susbtract == predictedDifference) {
            System.out.println("test OK");
        } else {
            System.out.println(("ERROR!"));
        }
    }
}
