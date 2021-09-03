package com.cl.abi.shapecalculator.module;

import com.cl.abi.shapecalculator.shape.ShapeCalculator;
import com.cl.abi.shapecalculator.state.*;
import lombok.Getter;
import lombok.Setter;

public class Calculator {
    @Setter
    private State currentState = new ChooseShapeState(this);

    @Setter
    @Getter
    private ShapeCalculator calculator;

    @Setter
    @Getter
    private int a;

    public String print() {
        return currentState.print();
    }

    public void input(String answer) throws Exception {
        currentState.input(answer);
    }

}
