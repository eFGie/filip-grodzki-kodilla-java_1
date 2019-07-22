package com.kodilla.spring.com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    private String username;
    private String surname;

    public ForumUser() {
        this.username =  "John Smith";
    }

    public String getUsername() {
        return username;
    }

}
