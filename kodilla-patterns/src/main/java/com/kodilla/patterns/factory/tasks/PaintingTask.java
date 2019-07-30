package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;
    boolean isTaskExecuted;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
