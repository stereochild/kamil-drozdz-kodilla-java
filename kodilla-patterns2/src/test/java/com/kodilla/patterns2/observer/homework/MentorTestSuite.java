package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Homework decorator = new Homework("Decorator Pattern: decorate pizza");
        Homework observer = new Homework("Observer Pattern: task to check");
        Homework facade = new Homework("Facade Pattern: create a facade");
        Homework adapter = new Homework("Adapter Pattern: books, books");
        Mentor aMichalski = new Mentor("Adam Michalski");
        Mentor jAndrzejewski = new Mentor("Jarosław Andrzejewski");

        decorator.registerObserver(aMichalski);
        decorator.registerObserver(jAndrzejewski);
        observer.registerObserver(aMichalski);
        facade.registerObserver(aMichalski);
        facade.registerObserver(jAndrzejewski);
        adapter.registerObserver(aMichalski);

        //When
        decorator.addTask("done!");
        decorator.addTask("check, check");
        observer.addTask("ready to check");
        facade.addTask("my facade");
        adapter.addTask("books, books and more books");

        //Then
        assertEquals(5, aMichalski.getUpdateCount());
        assertEquals(3, jAndrzejewski.getUpdateCount());
    }
}
