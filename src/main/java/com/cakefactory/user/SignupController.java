package com.cakefactory.user;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/signup")
public class SignupController {

    @GetMapping()
    ModelAndView getSignUpForm() {
        return new ModelAndView("signup", Map.of("basketTotal", 0));
    }

}
