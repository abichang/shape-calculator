package com.cl.abi.shapecalculator.module;

import com.cl.abi.shapecalculator.shape.Circle;
import com.cl.abi.shapecalculator.shape.Rectangle;
import com.cl.abi.shapecalculator.shape.ShapeCalculator;

public class Calculator {
    private Flow currentFlow = Flow.CHOOSE_SHAPE;

    private int a;
    private int b;

    private ShapeCalculator calculator;

    public String print() {
        if (currentFlow == Flow.PRINT_RESULT) {
            return String.format(currentFlow.getMessage(), calculator.getArea(), calculator.getCircumference());
        }
        return currentFlow.getMessage();
    }

    public void input(String answer) throws Exception {
        switch (currentFlow) {
            case CHOOSE_SHAPE:
                if ("R".equals(answer)) {
                    currentFlow = Flow.ASK_RECTANGLE_SIDE_A;
                    return;
                }

                if ("C".equals(answer)) {
                    currentFlow = Flow.ASK_CIRCLE_RADIUS;
                    return;
                }

                throw new Exception("Wrong Shape");

            case ASK_CIRCLE_RADIUS:
                calculator = new Circle(Integer.parseInt(answer));
                currentFlow = Flow.PRINT_RESULT;
                return;

            case ASK_RECTANGLE_SIDE_A:
                a = Integer.parseInt(answer);
                currentFlow = Flow.ASK_RECTANGLE_SIDE_B;
                return;

            case ASK_RECTANGLE_SIDE_B:
                b = Integer.parseInt(answer);
                calculator = new Rectangle(a, b);
                currentFlow = Flow.PRINT_RESULT;
                return;

            case PRINT_RESULT:
                throw new Exception("This step shouldn't have any input.");
        }
    }
}
