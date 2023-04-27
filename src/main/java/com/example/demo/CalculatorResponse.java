package com.example.demo;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CalcController {
 
	@GetMapping("ping")
    public String ping() {
        return "Welcome to Java Web App!!! This is updated!\n" + new Date().toString();
    }

	@GetMapping("add")
    public CalculatorResponse Add(@RequestParam("x") int x, @RequestParam("y") int y) {
        return new CalculatorResponse(x, y, x + y);
    }

	@GetMapping("sub")
    public CalculatorResponse Sub(@RequestParam("x") int x, @RequestParam("y") int y) {
        return new CalculatorResponse(x, y, x - y);
    }

	@GetMapping("Mul")
    public CalculatorResponse Mul(@RequestParam("x") int x, @RequestParam("y") int y) {
        return new CalculatorResponse(x, y, x * y);
    }

	@GetMapping("div")
    public CalculatorResponse Div(@RequestParam("x") int x, @RequestParam("y") int y) {
        return new CalculatorResponse(x, y, x / y);
    }


}
