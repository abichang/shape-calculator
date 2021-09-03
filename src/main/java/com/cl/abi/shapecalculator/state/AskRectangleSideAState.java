package com.cl.abi.shapecalculator.state;

import com.cl.abi.shapecalculator.module.Calculator;
import com.cl.abi.shapecalculator.module.Flow;

public class AskRectangleSideAState implements State {
    private final Calculator calculator;

    public AskRectangleSideAState(Calculator calculator) {
        this.calculator = calculator;
    }

    public String print() {
        return Flow.ASK_RECTANGLE_SIDE_A.getMessage();
    }

    public void input(String answer) {
        calculator.setA(Integer.parseInt(answer));
        calculator.setCurrentState(new AskRectangleSideBState(calculator));
    }
}