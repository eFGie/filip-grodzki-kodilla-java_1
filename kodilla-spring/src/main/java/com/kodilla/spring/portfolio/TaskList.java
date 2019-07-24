package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    final List<String> tasks = new ArrayList<>();

    public TaskList() {
    }

    public List<String> getTaskList() {
        return tasks;
    }

    public void taskAdd(String task) {
        tasks.add(task);
    }
}