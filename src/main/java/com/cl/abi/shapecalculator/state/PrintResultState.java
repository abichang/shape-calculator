package com.cl.abi.shapecalculator.state;

import com.cl.abi.shapecalculator.module.Calculator;
import com.cl.abi.shapecalculator.module.Flow;
import com.cl.abi.shapecalculator.shape.ShapeCalculator;

public class PrintResultState implements State {
    private final Calculator calculator;

    public PrintResultState(Calculator calculator) {
        this.calculator = calculator;
    }

    public String print() {
        ShapeCalculator shapeCalculator = calculator.getCalculator();
        return String.format(Flow.PRINT_RESULT.getMessage(), shapeCalculator.getArea(), shapeCalculator.getCircumference());
    }

    public void input(String answer) throws Exception {
        throw new Exception("This step shouldn't have any input.");
    }
}