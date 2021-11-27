package com.example.demo;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


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

    public List<Sandwich> findTopSandwiches() {
        return sandwichRepository.findAllByIdLessThanEqual(5);
    }


    public Sandwich findById(Integer id) {
        Optional<Sandwich> byId =sandwichRepository.findById(id);
        return byId.orElseThrow(RuntimeException::new);
    }

    public void addIngredients(Sandwich sandwich, Ingredients ingredients) {
        if(sandwich.getIngredients() != null) {
            sandwich.getIngredients().add(ingredients);
        }
    }

    public void changeName(Sandwich sandwich) {
        if (sandwich.getName() != null) {
            sandwich.setName(sandwich.getName() + "ABC");
        }
    }

    public void changeBaseCalories(Sandwich sandwich) {
        if(sandwich.getBaseCalories() != null) {
            sandwich.setBaseCalories(sandwich.getBaseCalories() + 100);
        }
    }

    public void changeBasePrice(Sandwich sandwich) {
        if(sandwich.getBasePrice() != null) {
            sandwich.setBasePrice(sandwich.getBasePrice() + 100);
        }
    }

    public void changeSize(Sandwich sandwich, SizeOfSandwich sizeOfSandwich) {
        if(sandwich.getSize() != SizeOfSandwich.L) {
            sandwich.setSize(SizeOfSandwich.L);
        }
    }
    private double calculatedPrice(Sandwich sandwich) {
        double finalPrice = sandwich.getBasePrice();
        for(Ingredients ingredients : sandwich.getIngredients()) {
            finalPrice += ingredients.getPrice();
        }
        return finalPrice;
    }
}


//co to jest @Repository
//co to jest @JPAREPOSITORY
//Jak stworzyć @Repository
//Jak zapisywać do bazy danych
//Jak odczytywać z bazy danych