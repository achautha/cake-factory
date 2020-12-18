package com.cakefactory.order;

import java.util.Collection;
import com.cakefactory.basket.BasketItem;
import lombok.Data;

@Data
public class OrderReceivedEvent {

    private final String address;
    private final Collection<BasketItem> items;
}
