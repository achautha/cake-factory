package com.cakefactory.order;

import java.util.Map;

import com.cakefactory.basket.Basket;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/order")
public class OrderController {

    private final ApplicationEventPublisher eventPublisher;
    private final Basket baset;

    @PostMapping
    public String completeOrder(@RequestParam String addressLine1, @RequestParam String addressLine2,
            @RequestParam String postcode) {

        String address = String.join(", ", addressLine1, addressLine2, postcode);
        this.eventPublisher.publishEvent(new OrderReceivedEvent(address, this.baset.getItems()));
        return "redirect:/order";
    }

    @GetMapping
    String order() {
        return "order";
    }

    public OrderController(ApplicationEventPublisher eventPublisher, Basket baset) {
        this.eventPublisher = eventPublisher;
        this.baset = baset;
    }
}
