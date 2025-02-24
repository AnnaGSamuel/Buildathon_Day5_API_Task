package com.example.Calculator.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class CalculatorApp {

    @PostMapping("/add")
    public int sum(@RequestBody Map<String,String> data){
        String getNum1 = data.get("num1");
        String getNum2 = data.get("num2");

        int num1 = Integer.parseInt(getNum1);
        int num2 = Integer.parseInt(getNum2);

        return num1+num2;

    }
    @PostMapping("/subtract")
    public int difference(@RequestBody Map<String,String> data){
        String getNum1 = data.get("num1");
        String getNum2 = data.get("num2");

        int num1 = Integer.parseInt(getNum1);
        int num2 = Integer.parseInt(getNum2);

        if(num1>num2)
            return num1-num2;
        else
            return num2-num1;

    }
    @PostMapping("/multiply")
    public int product(@RequestBody Map<String,String> data){
        String getNum1 = data.get("num1");
        String getNum2 = data.get("num2");

        int num1 = Integer.parseInt(getNum1);
        int num2 = Integer.parseInt(getNum2);

        return num1*num2;

    }
    @PostMapping("/divide")
    public int division(@RequestBody Map<String,String> data){
        String getNum1 = data.get("num1");
        String getNum2 = data.get("num2");

        int num1 = Integer.parseInt(getNum1);
        int num2 = Integer.parseInt(getNum2);

        if(num1>num2)
            return num1/num2;
        else
            return num2/num1;

    }
}