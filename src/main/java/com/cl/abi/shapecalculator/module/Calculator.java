package com.cl.abi.shapecalculator.module;

import com.cl.abi.shapecalculator.shape.ShapeCalculator;
import com.cl.abi.shapecalculator.state.*;
import lombok.Getter;
import lombok.Setter;

@Setter
public class Calculator {
    private State currentState = new ChooseShapeState(this);

    @Getter
    private ShapeCalculator calculator;

    @Getter
    private int a;

    public String print() {
        return currentState.print();
    }

    public void input(String answer) throws Exception {
        currentState.input(answer);
    }

}
