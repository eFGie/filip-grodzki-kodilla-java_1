package com.kodilla.good.patterns.challenges;

public final class User {
    private final int userID;
    private final String firstName;
    private final String surname;
    private final String email;

    public User(final int userID,final String firstName,final String surname, final String email) {
        this.userID = userID;
        this.firstName = firstName;
        this.surname = surname;
        this.email = email;
    }

    public int getUserID() {
        return userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }
}
