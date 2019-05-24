package com.kodilla.testing.forum.statistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class StatisticCalcTestSuite {
    @Test
    public void calculateAdvStatisticsWithMock() {

        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNames = new ArrayList<String>();

        int userCount = 100;
        for(int i =  1; i <= userCount; i++){
            usersNames.add("User_" + i);
        }

        int postsCount = 2534;
        int commentsCount = 4175;

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticsMock);

        HashMap<String, Double> resultExpected = new HashMap<String, Double>();
        resultExpected.put("userAvgPosts", 25.34);
        resultExpected.put("userAvgComments", 41.75);
        resultExpected.put("postAvgComments", 1.65 );

        Assert.assertEquals(resultExpected, statisticsCalc.calculateAdvStatistics(statisticsMock));

    }
}
