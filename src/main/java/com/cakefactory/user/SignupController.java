package com.cakefactory.user;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SignupController {

    @GetMapping("/signup")
    ModelAndView getSignUpForm() {
        return new ModelAndView("signup", Map.of("basketTotal", 0));
    }

    @PostMapping("/signup-submit")
    ModelAndView completeSignup() {

    }
}
