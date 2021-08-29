package com.cl.abi.shapecalculator.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void all_ok() {
        Circle circle = new Circle(5);

        assertEquals(Math.round(Math.PI * Math.pow(5, 2)), circle.getArea());
        assertEquals(Math.round(5 * 2 * Math.PI), circle.getCircumference());
    }
}