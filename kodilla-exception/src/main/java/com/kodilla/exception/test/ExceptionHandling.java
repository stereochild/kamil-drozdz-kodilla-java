package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.propablyWillThrowException(21.8, 3.3);
            System.out.println("Done!");
        } catch (Exception e) {
            System.out.println("Something went wrong. Error: " + e);
        } finally {
            System.out.println("This is a second challenge.");
        }
    }
}
