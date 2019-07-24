package com.kodilla.spring.portfolio;

public final class Board {
    final private TaskList toDoList;
    final private TaskList inProgressList;
    final private TaskList doneList;

    public Board(final TaskList toDoList, final TaskList inProgressList, final TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void toDoListTaskAdd(String task) {
        toDoList.taskAdd(task);
    }

    public void inProgressListTaskAdd(String task) {
        inProgressList.taskAdd(task);
    }

    public void doneListTaskAdd(String task) {
        doneList.taskAdd(task);
    }

}
