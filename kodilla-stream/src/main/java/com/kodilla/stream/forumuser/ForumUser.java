package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String username;
    private final char sex;
    private final LocalDate birthDate;
    private final int postscounter;

    public ForumUser(final int userID, final String username, final char sex, final LocalDate birthDate, final int postscounter) {
        this.userID = userID;
        this.username = username;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postscounter = postscounter;
    }

    public int getUserID() {
        return userID;
    }
    public String getUsername() {
        return username;
    }
    public char getSex() {
        return sex;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public int getPostscounter() {
        return postscounter;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postscounter=" + postscounter +
                '}';
    }
}
