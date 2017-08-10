package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ForumMain {
    public static void main(String[] args) {
        Forum myForum = new Forum();
        Map<String, Object> theResultMap = myForum.getList().stream()
            .filter(forumUser -> forumUser.getSex() == 'M')
            .filter(forumUser -> Period.between(forumUser.getBirthDate(), LocalDate.now()).getYears() > 19)
            .filter(forumUser -> forumUser.getPostscounter() != 0)
            .collect(Collectors.toMap(ForumUser::getUsername, forumUser -> forumUser));

        theResultMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
