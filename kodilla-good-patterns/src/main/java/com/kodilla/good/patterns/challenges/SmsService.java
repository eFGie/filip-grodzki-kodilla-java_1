package com.kodilla.good.patterns.challenges;

public class SmsService implements InformationService {
    public void inform(User user) {
       System.out.println("SMS sending to " + user.getEmail());
    }
}
