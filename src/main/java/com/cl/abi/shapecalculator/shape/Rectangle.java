package com.cl.abi.shapecalculator.shape;

public class Rectangle implements ShapeCalculator {

    private final int sideA;
    private final int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public long getArea() {
        return (long) sideA * sideB;
    }

    @Override
    public long getCircumference() {
        return (sideA + sideB) * 2L;
    }
}
