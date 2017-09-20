package com.kodilla.patterns.factory.task;

public final class DrivingTask implements Task{
    private final String taskName;
    private final String where;
    private final String using;
    boolean executedTask = false;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("Task executed: Drive " + where + " by " + using);
        executedTask = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executedTask;
    }
}
