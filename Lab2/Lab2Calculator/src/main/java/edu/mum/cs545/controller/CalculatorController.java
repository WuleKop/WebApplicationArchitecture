package edu.mum.cs545.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.mum.cs545.domain.Calculator;
import edu.mum.cs545.service.CalculatorService;
import edu.mum.cs545.validator.CalculatorValidator;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.RequestMapping;
import mum.edu.framework.annotation.Controller;

@Controller
public class CalculatorController {

    @AutoWired
    CalculatorValidator calculatorValidator;
    @AutoWired
    CalculatorService calculatorService;

    @RequestMapping(value = { "/", "/calc_input" })
    public String inputCalculator(HttpServletRequest request, HttpServletResponse response) {
        return "index.jsp";
    }

    @RequestMapping(value = "/calc_save")
    public String calculateInputs(Calculator calculator, HttpServletRequest request, HttpServletResponse response) {

        List<String> errors = calculatorValidator.validate(calculator);
        if (errors.isEmpty()) {

            calculatorService.add(calculator);
            calculatorService.mult(calculator);

            request.setAttribute("calculator", calculator);

            return "result.jsp";
        }
        else {
//
            request.setAttribute("errors", errors);
            request.setAttribute("calculator", calculator);
             return "index.jsp";
          }
    }
}
