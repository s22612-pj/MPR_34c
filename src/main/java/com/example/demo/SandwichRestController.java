package com.example.demo;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/sandwich")
public class SandwichRestController {

    private final SandwichService sandwichService;

    public SandwichRestController(SandwichService sandwichService) {
        this.sandwichService = sandwichService;
    }



    @GetMapping("/example")
    public ResponseEntity<Sandwich> getExampleSandwich() {
        return ResponseEntity.ok(sandwichService.prepareSandwich());

    }

    @GetMapping("/example2")
    public ResponseEntity<Sandwich> prepareSandwich(@RequestParam String sandwichName) {
        return ResponseEntity.ok(sandwichService.prepareSandwich(sandwichName));

    }

    @GetMapping("/top5")
    public ResponseEntity<List<Sandwich>> getTopFiveSandwiches() {
        return ResponseEntity.ok(sandwichService.findTopSandwiches());

    }

    @GetMapping("/{id}")
    public ResponseEntity<Sandwich> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(sandwichService.findById(id));

    }
    //poczytac o @restcontroller
    //poczytac o @service
    //poczytac o wstrzykiwaniu zaleznosci
    //poczytac o postman
}
