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

        int userCount = 142;
        for(int i =  1; i <= userCount; i++){
            usersNames.add("User_" + i);
        }

        int postsCount = 9751;
        int commentsCount = 7454;

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticsMock);

        statisticsCalc.calculateAdvStatistics(statisticsMock);

        double userAvgPostsExpected = 68.67;
        double userAvgPostsActual = statisticsCalc.getUserAvgPosts();

        double userAvgCommentsExpected = 52.49;
        double userAvgCommentsActual = statisticsCalc.getUserAvgComments();

        double postAvgCommentsExpected = 0.76;
        double postAvgCommentsActual = statisticsCalc.getPostAvgComments();

        Assert.assertEquals(userAvgPostsExpected,userAvgPostsActual,0);
        Assert.assertEquals(userAvgCommentsExpected,userAvgCommentsActual,0);
        Assert.assertEquals(postAvgCommentsExpected,postAvgCommentsActual,0);
    }
}
