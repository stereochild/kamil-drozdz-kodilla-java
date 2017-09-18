package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User rick = new Millenials("Rick");
        User morty = new ZGeneration("Morty");
        User summer = new YGeneration("Summer");

        //When
        String rickShare = rick.sharePost();
        System.out.println("Rick share post on: " + rickShare);
        String mortyShare = morty.sharePost();
        System.out.println("Morty share port on: " + mortyShare);
        String summerShare = summer.sharePost();
        System.out.println("Summer share post on: " + summerShare);

        //Then
        Assert.assertEquals("Facebook", rickShare);
        Assert.assertEquals("Snapchat", mortyShare);
        Assert.assertEquals("Twitter", summerShare);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User rick = new Millenials("Rick");

        //When
        String rickShare = rick.sharePost();
        System.out.println("Rick share post on: " + rickShare);
        rick.setSocialPublisher(new SnapchatPublisher());
        rickShare = rick.sharePost();
        System.out.println("Rick share post on: " + rickShare);

        //Then
        Assert.assertNotEquals("Facebook", rickShare);
        Assert.assertEquals("Snapchat", rickShare);
    }
}
