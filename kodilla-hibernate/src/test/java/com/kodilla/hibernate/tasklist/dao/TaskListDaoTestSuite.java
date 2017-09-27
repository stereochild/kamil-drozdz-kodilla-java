package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "Test: listname";
    private static final String DESCRIPTION = "Test: description";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(DESCRIPTION, LISTNAME);
        taskListDao.save(taskList);
        String listName = taskList.getListName();
        //When
        List<TaskList> taskLists = taskListDao.findByListName(listName);
        //Then
        Assert.assertEquals(1, taskLists.size());
        Assert.assertEquals(LISTNAME, taskLists.get(0).getListName());
        Assert.assertEquals(DESCRIPTION, taskLists.get(0).getDescription());
        //CleanUp
        int id = taskLists.get(0).getId();
        taskListDao.delete(id);

    }
}
