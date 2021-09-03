package com.cl.abi.shapecalculator.state;

import com.cl.abi.shapecalculator.module.Calculator;
import com.cl.abi.shapecalculator.shape.Circle;

public class AskCircleRadiusState implements State {
    private final Calculator calculator;

    public AskCircleRadiusState(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public String print() {
        return "Circle radius length?";
    }

    @Override
    public void input(String answer) {
        calculator.setCalculator(new Circle(Integer.parseInt(answer)));
        calculator.setCurrentState(new PrintResultState(calculator));
    }
}