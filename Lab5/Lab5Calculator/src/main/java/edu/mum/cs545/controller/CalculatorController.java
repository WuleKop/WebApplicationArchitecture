package edu.mum.cs545.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.mum.cs545.domain.Calculator;
import edu.mum.cs545.service.CalculatorService;
import edu.mum.cs545.validator.CalculatorValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CalculatorController {

    @Autowired
    CalculatorValidator calculatorValidator;

    @Autowired
    CalculatorService calculatorService;

    @RequestMapping("/")
    public String inputCalculator() {
        return "calculator";
    }

    @RequestMapping(value = "/calc_save", method = RequestMethod.POST)
    public String calculateInputs(Calculator calculator, Model model, RedirectAttributes redirectAttributes) {

        List<String> errors = calculatorValidator.validate(calculator);
        if (errors.isEmpty()) {

            calculatorService.add(calculator);
            calculatorService.mult(calculator);

            redirectAttributes.addFlashAttribute("welcome","Welcome to the Calculator App");
            redirectAttributes.addFlashAttribute("calculator", calculator);


            return "redirect:/calc_save";
        }
        else {
            //
            model.addAttribute("errors",errors);
            model.addAttribute("calculator", calculator);

             return "calculator";
          }
    }
    @RequestMapping(value = "/calc_save", method = RequestMethod.GET)
    public String resultDisplay() {
        return "result";
    }
}
