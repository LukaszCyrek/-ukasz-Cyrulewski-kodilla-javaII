package com.kodilla.testing.shape;
import java.util.ArrayList;
import java.util.List;


public class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public void showFigues() {
        for (Shape shape : shapes) {
            System.out.println(shape.getShapeName());
        }
    }
      public List<Shape> getFigures() {
            return shapes;

    }
}


