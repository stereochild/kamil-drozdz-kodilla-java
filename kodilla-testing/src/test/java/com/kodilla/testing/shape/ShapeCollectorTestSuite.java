package com.kodilla.testing.shape;

import org.junit.*;
import sun.security.provider.SHA;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

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
        ShapeCollector myShape = new ShapeCollector();
        Circle circle = new Circle();
        //When
        myShape.addFigure(circle);
        //Then
        assertEquals(1, myShape.shapes.size());
    }

    @Test
    public void testRemoveShape() {
        //Given
        ShapeCollector myShape = new ShapeCollector();
        Triangle triangle = new Triangle();
        myShape.addFigure(triangle);
        //When
        boolean result = myShape.removeFigure(triangle);
        //Then
        Assert.assertTrue(result);
        assertEquals(0, myShape.shapes.size());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector myShape = new ShapeCollector();
        Square square = new Square();
        myShape.addFigure(square);
        //When
        Shape retrievedFigure = myShape.getFigure(0);
        //Then
        assertEquals(square, retrievedFigure);
    }

   @Test
    public void testShowFigures() {
        //Given
        ShapeCollector myShape = new ShapeCollector();

        Triangle triangle = new Triangle();
        Square square = new Square();
        Circle circle = new Circle();

        List<Shape> expectedList = new ArrayList<>();
        expectedList.add(triangle);
        expectedList.add(square);
        expectedList.add(circle);

        myShape.addFigure(triangle);
        myShape.addFigure(square);
        myShape.addFigure(circle);

        //When
        List<Shape> showMeWhatYouGot = myShape.showFigures();

        //Then
        assertEquals(expectedList, showMeWhatYouGot);
    }
}
