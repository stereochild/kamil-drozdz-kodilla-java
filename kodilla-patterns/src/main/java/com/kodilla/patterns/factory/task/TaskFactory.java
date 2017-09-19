package com.kodilla.patterns.factory.task;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Buy", "apple", 2.0);
            case PAINTING:
                return new PaintingTask("Paint", "red", "wall");
            case DRIVING:
                return new DrivingTask("Drive", "home", "car");
            default:
                return null;
        }
    }
}
