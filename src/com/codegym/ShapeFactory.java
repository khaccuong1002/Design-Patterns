package com.codegym;

public class ShapeFactory {
    public Shape getShape(ShapeType shapeType){
        Shape shapeCreated = null;
        switch (shapeType){
            case CIRCLE ->
                shapeCreated = new Circle();
            case SQUARE ->
                shapeCreated = new Square();
            case RECTANGLE ->
                shapeCreated = new Rectangle();
            case TRIANGLE ->
                shapeCreated = new Triangle();
        }
        return shapeCreated;
    }
}
