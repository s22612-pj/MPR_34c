package com.example.demo;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sandwich")
public class SandwichRestController {

    @GetMapping("/example")
    public ResponseEntity<Sandwich> getExampleSandwich() {
        Ingredients bread = new Ingredients(1, "white", 100,1.5d);
        Sandwich poorOne = new Sandwich(1, "poor", 100, 5.0d, List.of(bread), SizeOfSandwich.XL);

        return ResponseEntity.ok(poorOne);

    }
    @GetMapping("/example2")
    public ResponseEntity<Sandwich> getNullSandwich() {
        Sandwich something = new Sandwich(null, "asd", 1201, 5.2d, null, SizeOfSandwich.S);
        return ResponseEntity.ok(something);
    }
}
