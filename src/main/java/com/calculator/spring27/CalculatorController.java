package com.calculator.spring27;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String getWelcome() {
        return "Добро пожаловать";
    }

    @GetMapping(path = "/plus")
    public String getSummary(@RequestParam(value = "num1", required = false) Integer num1,
                             @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Один из параметров отсутствует";
        }
        int result = calculatorService.getSummary(num1, num2);
        return num1 + " + " + num2 + " = " + result;
    }

    @GetMapping(path = "/minus")
    public String getMinus(@RequestParam(value = "num1", required = false) Integer num1,
                           @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Один из параметров отсутствует";
        }
        int result = calculatorService.getMinus(num1, num2);
        return num1 + " - " + num2 + " = " + result;
    }

    @GetMapping(path = "multiply")
    public String getMultiply(@RequestParam(value = "num1", required = false) Integer num1,
                              @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Один из параметров отсутствует";
        }
        int result = calculatorService.getMultiply(num1, num2);
        return num1 + " * " + num2 + " = " + result;
    }

    @GetMapping(path = "/divide")
    public String getDivide(@RequestParam(value = "num1", required = false) Integer num1,
                            @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Один из параметров отсутствует";
        } else if (num1 == 0 || num2 == 0) {
            return "На ноль делить нельзя";
        }
        int result = calculatorService.getDivide(num1, num2);
        return num1 + " / " + num2 + " = " + result;
    }
}
