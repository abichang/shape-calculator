package com.cl.abi.shapecalculator.state;

import com.cl.abi.shapecalculator.module.Calculator;

public class AskRectangleSideAState implements State {
    private final Calculator calculator;

    public AskRectangleSideAState(Calculator calculator) {
        this.calculator = calculator;
    }

    public String print() {
        return "Rectangle side A length?";
    }

    public void input(String answer) {
        calculator.setA(Integer.parseInt(answer));
        calculator.setCurrentState(new AskRectangleSideBState(calculator));
    }
}