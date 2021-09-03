package com.cl.abi.shapecalculator.state;

import com.cl.abi.shapecalculator.module.Calculator;
import com.cl.abi.shapecalculator.shape.Rectangle;

public class AskRectangleSideBState implements State {
    private final Calculator calculator;

    public AskRectangleSideBState(Calculator calculator) {
        this.calculator = calculator;
    }

    public String print() {
        return "Rectangle side B length?";
    }

    public void input(String answer) {
        calculator.setCalculator(new Rectangle(calculator.getA(), Integer.parseInt(answer)));
        calculator.setCurrentState(new PrintResultState(calculator));
    }
}