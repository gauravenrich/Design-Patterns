package com.gaurav.decorator.color;

public class BlueShapeDecorator extends RedShapeDecorator{

    public BlueShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setBlueBorder();
    }

    private void setBlueBorder() {
        System.out.println("Print Color : Blue");
    }

}
