package com.kodilla.patterns.social;

import com.kodilla.patterns.strategy.social.*;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {

        //Given
        User steven = new Millenials("Steven Links");
        User john = new YGeneration("John Hemerald");
        User kodilla = new ZGeneration("Kodilla");

        //When
        String stevenSocialMedia = steven.sharePost();
        System.out.println("Steven socialMedia: " + stevenSocialMedia);
        String johnSocialMedia = john.sharePost();
        System.out.println("John socialMedia: " + johnSocialMedia);
        String kodillaSocialMedia  = kodilla.sharePost();
        System.out.println("Kodilla socialMedia: " + kodillaSocialMedia);

        //Then
        Assert.assertEquals("Facebook", stevenSocialMedia);
        Assert.assertEquals("Twitter", johnSocialMedia);
        Assert.assertEquals("Snapchat", kodillaSocialMedia);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User steven = new Millenials("Steven Links");

        //When
        String stevenSocialMedia = steven.sharePost();
        System.out.println("Steven socialMedia: " + stevenSocialMedia);
        steven.setSocialPublisher(new TwitterPublisher());
        stevenSocialMedia = steven.sharePost();
        System.out.println("Steven now socialMedia: " + stevenSocialMedia);

        //Then
        Assert.assertEquals("Twitter", stevenSocialMedia);
    }
}
