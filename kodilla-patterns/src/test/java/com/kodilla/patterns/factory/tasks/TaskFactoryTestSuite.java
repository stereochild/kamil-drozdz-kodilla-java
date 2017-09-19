package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.task.Task;
import com.kodilla.patterns.factory.task.TaskFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Buy", shoppingTask.getTaskName());
        Assert.assertTrue(shoppingTask.isTaskExecuted());
        Assert.assertEquals("Task done: Buy apple 2.0", shoppingTask.executeTask());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Paint", paintingTask.getTaskName());
        Assert.assertTrue(paintingTask.isTaskExecuted());
        Assert.assertEquals("Task done: Paint wall in red", paintingTask.executeTask());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driveTask = factory.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("Drive", driveTask.getTaskName());
        Assert.assertTrue(driveTask.isTaskExecuted());
        Assert.assertEquals("Task executed: Drive home by car", driveTask.executeTask());
    }
}
