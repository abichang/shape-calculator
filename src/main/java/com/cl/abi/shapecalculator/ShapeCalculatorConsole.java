package com.cl.abi.shapecalculator;

import com.cl.abi.shapecalculator.shape.Circle;
import com.cl.abi.shapecalculator.shape.Rectangle;
import com.cl.abi.shapecalculator.shape.ShapeCalculator;

import java.util.Scanner;

public class ShapeCalculatorConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Shape: (C)ircle or (R)ectangle? ");
        String shapeChar = scanner.nextLine();

        if (shapeChar.equals("C")) {
            System.out.print("Circle radius length? ");
            int radius = scanner.nextInt();

            printResult(new Circle(radius));
        } else if (shapeChar.equals("R")) {
            System.out.print("Rectangle side A length? ");
            int sideA = scanner.nextInt();

            scanner.nextLine();
            System.out.print("Rectangle side B length? ");
            int sideB = scanner.nextInt();

            printResult(new Rectangle(sideA, sideB));
        } else {
            System.out.println("Error: Shape didn't support.");
        }
    }

    public static void printResult(ShapeCalculator calculator) {
        System.out.printf("Area=%d\n", calculator.getArea());
        System.out.printf("Circumference=%d\n", calculator.getCircumference());
    }
}
