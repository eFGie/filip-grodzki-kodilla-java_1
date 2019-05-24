package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatisticsCalc {
    Statistics statistics;
    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double userAvgPosts;
    private double userAvgComments;
    private double postAvgComments;

    public StatisticsCalc(Statistics statistics){
        this.statistics = statistics;
    }

    public double getUserAvgPosts() {
        return userAvgPosts;
    }

    public double getUserAvgComments() {
        return userAvgComments;
    }

    public double getPostAvgComments() {
        return postAvgComments;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        userAvgPosts = 0.00;
        if (statistics.usersNames().size() == 0) {
            userAvgPosts = 0.00;
        } else {
            userAvgPosts =(double) Math.round((double) postsCount / (double) usersCount * 100) / 100;
        }

        userAvgComments = 0.00;
        if (statistics.usersNames().size() == 0) {
            userAvgComments = 0.00;
        } else {
            userAvgComments =(double) Math.round((double) commentsCount / (double) usersCount * 100) / 100;
        }

        postAvgComments = 0.00;
        if (statistics.postsCount() == 0) {
            postAvgComments = 0.00;
        } else {
            postAvgComments =(double) Math.round((double) commentsCount / (double) postsCount * 100) / 100;
        }
    }

    public void  showStatistics() {
    }
}
