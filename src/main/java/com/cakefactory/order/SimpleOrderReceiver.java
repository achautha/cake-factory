package com.cakefactory.order;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SimpleOrderReceiver {

    @EventListener
    public void onOrderRecieved(OrderReceivedEvent event) {
        System.out.println("New Order !!");
        event.getItems().forEach(System.out::print);
    }
}
