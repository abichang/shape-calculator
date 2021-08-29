package com.cl.abi.shapecalculator.module;

import lombok.Getter;

@Getter
public enum Flow {
    CHOOSE_SHAPE("Shape: (C)ircle or (R)ectangle?"),
    ASK_CIRCLE_RADIUS("Circle radius length?"),
    ASK_RECTANGLE_SIDE_A("Rectangle side A length?"),
    ASK_RECTANGLE_SIDE_B("Rectangle side B length?"),
    PRINT_RESULT("Area=%d, Circumference=%d");

    private String message;

    Flow(String message) {
        this.message = message;
    }
}
