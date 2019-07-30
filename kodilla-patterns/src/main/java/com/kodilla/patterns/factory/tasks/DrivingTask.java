package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;
    boolean isTaskExecuted;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public void executeTask() {
        isTaskExecuted = true;
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isTaskExecuted(){
        return isTaskExecuted;
    }
}
