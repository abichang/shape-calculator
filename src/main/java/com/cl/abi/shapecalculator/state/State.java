package com.cl.abi.shapecalculator.state;

public interface State {
    String print();

    void input(String answer) throws Exception;
}
