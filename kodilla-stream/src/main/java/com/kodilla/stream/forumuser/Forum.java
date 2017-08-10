package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(10001, "totoro", 'M', LocalDate.parse("1999-03-16"), 119));
        forumUserList.add(new ForumUser(10002, "vaultB0y", 'M', LocalDate.parse("1980-04-30"), 456));
        forumUserList.add(new ForumUser(10003, "Marry", 'F', LocalDate.parse("1997-01-02"), 15));
        forumUserList.add(new ForumUser(10004, "Gorgoro+h", 'M', LocalDate.parse("1988-11-02"), 0));
        forumUserList.add(new ForumUser(10005, "SmurfGurll", 'F', LocalDate.parse("2000-09-15"),20));
        forumUserList.add(new ForumUser(10006, "Snake", 'M', LocalDate.parse("1996-12-17"),266));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(forumUserList);
    }

}
