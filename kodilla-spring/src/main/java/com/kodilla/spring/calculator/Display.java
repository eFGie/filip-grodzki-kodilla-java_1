package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

import javax.sound.midi.SysexMessage;

@Component
public class Display {
    public void displayValue(double val) {
        System.out.println("Value: " + val);
    }
}
