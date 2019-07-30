package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.ShapeFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.doTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("ShoppingTask",shoppingTask.getTaskName());

        shoppingTask.executeTask();
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.doTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals("DrivingTask",drivingTask.getTaskName());

        drivingTask.executeTask();
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.doTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals("PaintingTask",paintingTask.getTaskName());

        paintingTask.executeTask();
        Assert.assertTrue(paintingTask.isTaskExecuted());
    }
}
