package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StatisticsCalc {
    Statistics statistics;
    int usersCount;
    int postsCount;
    int commentsCount;
    int userNamesSize;
    private double userAvgPosts;
    private double userAvgComments;
    private double postAvgComments;

    public StatisticsCalc(Statistics statistics){
        this.statistics = statistics;
    }

    public HashMap<String, Double> calculateAdvStatistics(Statistics statistics) throws  ArithmeticException {

        HashMap<String, Double> resultMap = new HashMap<String, Double>();

        double userAvgPosts = 0.00;
        if (statistics.usersNames().size() == 0) {
            userAvgPosts = 0.00;
        } else {
            userAvgPosts =(double) Math.round((double) statistics.postsCount() / (double) statistics.usersNames().size() * 100) / 100;
        }

        double userAvgComments = 0.00;
        if (statistics.usersNames().size() == 0) {
            userAvgComments = 0.00;
        } else {
            userAvgComments =(double) Math.round((double) statistics.commentsCount() / (double) statistics.usersNames().size() * 100) / 100;
        }

        double postAvgComments = 0.00;
        if (statistics.postsCount() == 0) {
            postAvgComments = 0.00;
        } else {
            postAvgComments =(double) Math.round((double) statistics.commentsCount() / (double) statistics.postsCount() * 100) / 100;
        }

        resultMap.put("userAvgPosts", userAvgPosts);
        resultMap.put("userAvgComments", userAvgComments);
        resultMap.put("postAvgComments", postAvgComments);

        return resultMap;
    }

    public void  showStatistics() {
    }
}
