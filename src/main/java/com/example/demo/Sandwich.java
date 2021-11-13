package com.example.demo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Sandwich")
public class Sandwich{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private int baseCalories;
    private double basePrice;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Ingredients> ingredients;
    private SizeOfSandwich size;

    public Sandwich() {

    }

    public Sandwich(Integer id, String name, int baseCalories, double basePrice, List<Ingredients> ingredients, SizeOfSandwich size) {
        this.id = id;
        this.name = name;
        this.baseCalories = baseCalories;
        this.basePrice = basePrice;
        this.ingredients = ingredients;
        this.size = size;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBaseCalories() {
        return baseCalories;
    }

    public void setBaseCalories(int baseCalories) {
        this.baseCalories = baseCalories;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    public SizeOfSandwich getSize() {
        return size;
    }

    public void setSize(SizeOfSandwich size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", baseCalories=" + baseCalories +
                ", basePrice=" + basePrice +
                ", ingredients=" + ingredients +
                ", size=" + size +
                '}';
    }
}



//Odwolywanie stereotypów
//    \/
//controller do serwisu
//serwis do repozytorium