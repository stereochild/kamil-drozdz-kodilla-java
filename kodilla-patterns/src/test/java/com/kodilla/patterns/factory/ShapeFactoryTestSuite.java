package com.kodilla.patterns.factory;

import org.junit.Assert;
import org.junit.Test;

public class ShapeFactoryTestSuite {

    @Test
    public void testFactoryCircle() {
        //Given
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape circle = factory.makeShape(ShapeFactory.CIRCLE);
        //Then
        Assert.assertEquals(Math.PI * Math.pow(4.50, 2.0), circle.getField(), 0);
        Assert.assertEquals("The rounded circle", circle.getName());
        Assert.assertEquals(2 * Math.PI * 4.5, circle.getCircumference(), 0);
    }

    @Test
    public void testFactorySquare() {
        //Given
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape square = factory.makeShape(ShapeFactory.SQUARE);
        //Then
        Assert.assertEquals(Math.pow(7.0, 2.0), square.getField(), 0);
        Assert.assertEquals("The angular square", square.getName());
        Assert.assertEquals(28, square.getCircumference(), 0);
    }

    @Test
    public void testFactoryRectangle() {
        //Given
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape rectangle = factory.makeShape(ShapeFactory.RECTANGLE);
        //Then
        Assert.assertEquals(37.50, rectangle.getField(),0);
        Assert.assertEquals("The long rectangle", rectangle.getName());
        Assert.assertEquals(35, rectangle.getCircumference(), 0);
    }
}
