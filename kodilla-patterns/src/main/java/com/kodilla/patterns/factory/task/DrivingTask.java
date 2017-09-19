package com.kodilla.patterns.factory.task;

public final class DrivingTask implements Task{
    private final String taskName;
    private final String where;
    private final String using;
    boolean executedTask = true;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        return "Task executed: Drive " + where + " by " + using;
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
