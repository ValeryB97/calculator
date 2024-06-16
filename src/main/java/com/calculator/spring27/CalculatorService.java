package com.calculator.spring27;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorService {
    @GetMapping(path = "/calculator/plus")
    public int getSummary(int num1, int num2) {
        return num1 + num2;
    }

    @GetMapping(path = "/calculator/minus")
    public int getMinus(int num1, int num2) {
        return num1 - num2;
    }

    @GetMapping(path = "/calculator/multiply")
    public int getMultiply(int num1, int num2) {
        return num1 * num2;
    }

    @GetMapping(path = "/calculator/divide")
    public int getDivide(int num1, int num2) {
        return num1 / num2;
    }
}
