package com.springrest.cal.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	 @GetMapping("/calculate")
		@ResponseBody
		public String calculate(@RequestParam String operation, @RequestParam double firstOperand,
				@RequestParam double secondOperand) {
			switch (operation) {
			case "add":
				return Double.toString(firstOperand + secondOperand);
			case "subtract":
				return Double.toString(firstOperand - secondOperand);
			case "multiply":
				return Double.toString(firstOperand * secondOperand);
			case "divide":
				return Double.toString(firstOperand / secondOperand);
			default:
				return "Invalid operation";
			}
		}
	
}
