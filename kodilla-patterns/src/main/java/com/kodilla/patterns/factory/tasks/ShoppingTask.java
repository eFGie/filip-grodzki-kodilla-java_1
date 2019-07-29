package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task{
    final String taskName;
    final String whatToBuy;
    final double quantity;

    public ShoppingTask(final String taskName,final String whatToBuy,final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public String executeTask() {
        return "Executing ShoppingTask";
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isTaskExecuted(){
        return true;
    }

}
