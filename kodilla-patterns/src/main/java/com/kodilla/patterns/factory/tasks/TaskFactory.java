package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task doTask(final String task) {
        switch (task) {
            case SHOPPINGTASK:
                return new ShoppingTask("ShoppingTask", "Book",15);
            case PAINTINGTASK:
                return new PaintingTask("PaintingTask", "Black","Car");
            case DRIVINGTASK:
                return new DrivingTask("DrivingTask", "Warsaw", "Train");
            default:
                return null;
        }

    }
}
