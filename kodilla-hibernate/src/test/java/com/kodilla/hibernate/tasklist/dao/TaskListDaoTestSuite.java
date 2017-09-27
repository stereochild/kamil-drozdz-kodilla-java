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
        String names = taskList.getListName();
        //When
        List<TaskList> readNames = taskListDao.findByListName(names);
        //Then
        Assert.assertEquals(1, readNames.size());
        Assert.assertEquals(LISTNAME, readNames.get(0).getListName());
        Assert.assertEquals(DESCRIPTION, readNames.get(0).getDescription());
        //CleanUp
        int id = readNames.get(0).getId();
        taskListDao.delete(id);

    }
}
