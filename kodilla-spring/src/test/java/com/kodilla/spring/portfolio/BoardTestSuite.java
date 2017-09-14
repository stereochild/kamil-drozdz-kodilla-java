package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getDoneList().addTask("First Task");
        board.getInProgressList().addTask("Middle Task");
        board.getToDoList().addTask("Last Task");
        //Then
        Assert.assertEquals("First Task", board.getDoneList().getTasks().get(0));
        Assert.assertEquals("Middle Task", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("Last Task", board.getToDoList().getTasks().get(0));

        System.out.println(board.getDoneList().getTasks().get(0));
        System.out.println(board.getInProgressList().getTasks().get(0));
        System.out.println(board.getToDoList().getTasks().get(0));
    }
}
