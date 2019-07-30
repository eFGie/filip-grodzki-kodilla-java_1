package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task{
    final String taskName;
    final String whatToBuy;
    final double quantity;
    boolean isTaskExecuted;

    public ShoppingTask(final String taskName,final String whatToBuy,final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
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
