package com.cl.abi.shapecalculator.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void all_ok() {
        Rectangle rectangle = new Rectangle(5, 10);

        assertEquals(50L, rectangle.getArea());
        assertEquals(30L, rectangle.getCircumference());
    }
}