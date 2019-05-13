package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator calc = new Calculator();

        int addResult= calc.add(5,16);
        if (addResult == 21){
            System.out.println("add test OK");
        } else {
            System.out.println("add test Error!");
        }

        int substractResult= calc.substract(5,16);
        if (substractResult == -11){
            System.out.println("substract test OK");
        } else {
            System.out.println("substract test Error!");
        }

    }
}
