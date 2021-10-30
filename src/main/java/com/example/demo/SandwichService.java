package com.example.demo;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SandwichService {


    public Sandwich prepareSandwich(String sandwichName) {
        Ingredients bread = new Ingredients(1, "white", 100,1.5d);
        return new Sandwich(null, sandwichName, 100, 5.0d, List.of(bread), SizeOfSandwich.XL);
    }

    public Sandwich prepareSandwich() {
        Ingredients bread = new Ingredients(1, "white", 100,1.5d);
        return new Sandwich(1, "poor", 100, 5.0d, List.of(bread), SizeOfSandwich.XL);
    }

}
