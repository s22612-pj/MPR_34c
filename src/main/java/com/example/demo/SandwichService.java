package com.example.demo;


import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SandwichService {



    private SandwichRepository sandwichRepository;

    public SandwichService(SandwichRepository sandwichRepository) {
        this.sandwichRepository = sandwichRepository;
    }

    public Sandwich prepareSandwich(String sandwichName) {
        Ingredients bread = new Ingredients(1, "white", 100,1.5d);
        Sandwich sandwich = new Sandwich(null, sandwichName, 100, 5.0d, null, SizeOfSandwich.XL);
        sandwich.setName("Temp name");
        return sandwichRepository.save(sandwich);
    }

    public Sandwich prepareSandwich() {
        Ingredients bread = new Ingredients(1, "white", 100,1.5d);
        return new Sandwich(1, "poor", 100, 5.0d, null, SizeOfSandwich.XL);

    }

    public Sandwich topSandwich(String topSandwichName) {
        Ingredients bread = new Ingredients(1, "white", 100,1.5d);
        Sandwich sandwich = new Sandwich(1, topSandwichName, 100, 5.0d, null, SizeOfSandwich.XL);
        return sandwichRepository.save(sandwich);


    }





}


//co to jest @Repository
//co to jest @JPAREPOSITORY
//Jak stworzyć @Repository
//Jak zapisywać do bazy danych
//Jak odczytywać z bazy danych