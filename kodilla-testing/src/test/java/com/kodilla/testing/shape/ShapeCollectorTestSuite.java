package com.kodilla.testing.shape;
import com.kodilla.testing.shape.ShapeCollector;
import org.junit.*;



public class ShapeCollectorTestSuite {


    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testAddFigure(){
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Triangle triangle = new Triangle(4,4);

        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);

    }
    @Test
    public void testRemoveFigure() {
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Triangle triangle = new Triangle(4,4);

        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.removeFigure(circle);
        shapeCollector.removeFigure(square);
        shapeCollector.removeFigure(triangle);
        }
        @Test
    public void testShowFigure(){

        }


    }






