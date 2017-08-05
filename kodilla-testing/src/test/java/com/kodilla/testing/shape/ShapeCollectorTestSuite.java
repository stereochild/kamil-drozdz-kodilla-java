package com.kodilla.testing.shape;

import org.junit.*;

import java.util.List;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Start of tests.");
    }
    @AfterClass
    public static void afterAllTests() {
        System.out.println("End of tests.");
    }
    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Exectute test #" + testCounter);
    }

    @Test
    public void testAddShape() {
        //Given
        ShapeCollector myShape = new ShapeCollector(new Circle());
        //When
        myShape.addFigure(new Circle());
        //Then
        Assert.assertEquals(1, myShape.shapes.size());

    }

    @Test
    public void testRemoveShape() {
        //Given
        ShapeCollector myShape = new ShapeCollector(new Triangle());
        myShape.addFigure(new Triangle());
        //When
        boolean result = myShape.removeFigure(new Triangle());
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, myShape.shapes.size());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector myShape = new ShapeCollector(new Square());
        myShape.addFigure(new Square);
        //When
        ShapeCollector retrievedFigure = myShape.getFigure(0);
        //Then
        Assert.assertEquals(myShape, retrievedFigure);
    }

   @Test
    public void testShowFigure() {
        //Given
        ShapeCollector myShape = new ShapeCollector();
        myShape.addFigure(new Circle());
        myShape.addFigure(new Square());
        myShape.addFigure(new Triangle());
        //When
        myShape.showFigures();
        //Then

    }
}
