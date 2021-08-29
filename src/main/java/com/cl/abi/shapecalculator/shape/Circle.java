package com.cl.abi.shapecalculator.shape;

public class Circle implements ShapeCalculator {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public long getArea() {
        return Math.round(Math.PI * Math.pow(radius, 2));
    }

    @Override
    public long getCircumference() {
        return Math.round(radius * 2 * Math.PI);
    }
}
