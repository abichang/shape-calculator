package com.cl.abi.shapecalculator.module;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void when_choose_shape() {
        assertEquals("Shape: (C)ircle or (R)ectangle?", new Calculator().print());
    }

    @Test
    void choose_rectangle() throws Exception {
        Calculator calculator = new Calculator();

        given_choose_rectangle(calculator);

        then_message_should_be(calculator, "Rectangle side A length?");
    }

    @Test
    void choose_circle() throws Exception {
        Calculator calculator = new Calculator();

        given_choose_circle(calculator);

        then_message_should_be(calculator, "Circle radius length?");
    }

    @Test
    void choose_non_support_shape() {
        Calculator calculator = new Calculator();

        when_input_would_fail(() -> given_choose_unknown(calculator));
    }

    @Test
    void invalid_circle_radius() throws Exception {
        Calculator calculator = new Calculator();

        given_choose_circle(calculator);

        when_convert_to_number_would_fail(() -> given_invalid_input(calculator));
    }

    @Test
    void circle_result_ok() throws Exception {
        Calculator calculator = new Calculator();

        given_choose_circle(calculator);
        given_circle_radius(calculator, "5");

        then_result_should_be(calculator, "Area=79, Circumference=31");
    }

    @Test
    void invalid_rectangle_side_a() throws Exception {
        Calculator calculator = new Calculator();

        given_choose_rectangle(calculator);

        when_convert_to_number_would_fail(() -> given_invalid_input(calculator));
    }

    @Test
    void set_rectangle_side_a() throws Exception {
        Calculator calculator = new Calculator();

        given_choose_rectangle(calculator);
        given_rectangle_side(calculator, "5");

        then_message_should_be(calculator, "Rectangle side B length?");
    }

    @Test
    void invalid_rectangle_side_b() throws Exception {
        Calculator calculator = new Calculator();

        given_choose_rectangle(calculator);
        given_rectangle_side(calculator, "5");

        when_convert_to_number_would_fail(() -> given_invalid_input(calculator));
    }

    @Test
    void rectangle_result_ok() throws Exception {
        Calculator calculator = new Calculator();

        given_choose_rectangle(calculator);
        given_rectangle_side(calculator, "5");
        given_rectangle_side(calculator, "10");

        then_result_should_be(calculator, "Area=50, Circumference=30");
    }

    @Test
    void input_when_flow_is_print_result() throws Exception {
        Calculator calculator = new Calculator();

        given_choose_circle(calculator);
        given_circle_radius(calculator, "5");

        when_input_would_fail(() -> given_invalid_input(calculator));
    }

    private void then_result_should_be(Calculator calculator, String result) {
        assertEquals(result, calculator.print());
    }

    private void given_rectangle_side(Calculator calculator, String answer) throws Exception {
        calculator.input(answer);
    }

    private void given_invalid_input(Calculator calculator) throws Exception {
        calculator.input("hey");
    }

    private void given_choose_unknown(Calculator calculator) throws Exception {
        calculator.input("UNKNOWN");
    }

    private void given_choose_circle(Calculator calculator) throws Exception {
        calculator.input("C");
    }

    private void given_choose_rectangle(Calculator calculator) throws Exception {
        calculator.input("R");
    }

    private void given_circle_radius(Calculator calculator, String answer) throws Exception {
        calculator.input(answer);
    }

    private void then_message_should_be(Calculator calculator, String message) {
        assertEquals(message, calculator.print());
    }

    private void when_input_would_fail(Executable executable) {
        assertThrows(
                Exception.class,
                executable,
                "Should throw exception"
        );
    }

    private void when_convert_to_number_would_fail(Executable executable) {
        assertThrows(
                NumberFormatException.class,
                executable,
                "Should throw exception"
        );
    }
}