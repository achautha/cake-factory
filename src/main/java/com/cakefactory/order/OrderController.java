package com.cakefactory.order;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/order")
public class OrderController {

    @PostMapping
    public ModelAndView processOrder(@RequestParam String addressLine1, @RequestParam String addressLine2,
            @RequestParam String postcode) {
        return new ModelAndView("order", Map.of("basketTotal", 0));
    }
}
