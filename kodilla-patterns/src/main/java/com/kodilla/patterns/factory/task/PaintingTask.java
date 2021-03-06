package com.kodilla.patterns.factory.task;

public final class PaintingTask implements Task{
    private final String taskName;
    private final String color;
    private final String whatToPaint;
    boolean executedTask = false;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Task done: Paint " + whatToPaint + " in " + color);
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
