package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.TaskListDao;
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
    private static final String LISTNAME = "toDo";
    private static final String DESCRIPTION = "toDoDescription";

    @Test
    public void testTaskDaoFindByDuration() {
        //Given
        TaskList taskList = new TaskList(LISTNAME,DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readListTasks = taskListDao.findByListName(listName);

        //Then
        Assert.assertEquals(1, readListTasks.size());

        //CleanUp
        int id = readListTasks.get(0).getId();
        taskListDao.deleteById(id);
    }
}
