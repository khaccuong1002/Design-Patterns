package com.codegym;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape(ShapeType.TRIANGLE);
        shape.draw();
    }
}