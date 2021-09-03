package com.cl.abi.shapecalculator.state;

import com.cl.abi.shapecalculator.module.Calculator;
import com.cl.abi.shapecalculator.module.Flow;

public class ChooseShapeState implements State {

    private final Calculator calculator;

    public ChooseShapeState(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public String print() {
        return Flow.CHOOSE_SHAPE.getMessage();
    }

    @Override
    public void input(String answer) throws Exception {
        if ("R".equals(answer)) {
            calculator.setCurrentState(new AskRectangleSideAState(calculator));
        } else if ("C".equals(answer)) {
            calculator.setCurrentState(new AskCircleRadiusState(calculator));
        } else {
            throw new Exception("Wrong Shape");
        }
    }
}