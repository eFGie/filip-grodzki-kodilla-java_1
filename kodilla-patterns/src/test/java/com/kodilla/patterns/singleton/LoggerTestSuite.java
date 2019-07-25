package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;
import sun.rmi.runtime.Log;

public class LoggerTestSuite {
    @Test
    public void testGetFileName() {
        //When
        Logger.getInstance().log("test log");

        String getLog = Logger.getInstance().getLastLog();

        System.out.println("log: " + getLog);
        //Then
        Assert.assertEquals("test log", getLog);
    }


}



