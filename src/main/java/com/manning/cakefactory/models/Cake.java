package com.manning.cakefactory.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Cake {

    private final String name;
    private final String price;
    private final String description;
}
