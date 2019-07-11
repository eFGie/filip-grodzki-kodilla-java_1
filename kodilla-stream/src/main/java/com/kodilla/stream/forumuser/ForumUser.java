package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int ID;
    private final String userName;
    private final char Sex;
    private final LocalDate birthDate;
    private final int postsCount;

    public ForumUser(final int ID, final String userName, final char sex,
                     final LocalDate birthDate, int postsCount) {
        this.ID = ID;
        this.userName = userName;
        Sex = sex;
        this.birthDate = birthDate;
        this.postsCount = postsCount;
    }

    public int getID() {
        return ID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return Sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostsCount() {
        return postsCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "ID=" + ID +
                ", userName='" + userName + '\'' +
                ", Sex=" + Sex +
                ", birthDate=" + birthDate +
                ", postsCount=" + postsCount +
                '}';
    }
}




