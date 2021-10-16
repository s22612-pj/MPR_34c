package com.example.demo;

public class Ingredients {
    private Integer id;
    private String name;
    private int kcal;
    private double price;


    public Ingredients() {

    }

    public Ingredients(Integer id, String name, int kcal, double price) {
        this.id = id;
        this.name = name;
        this.kcal = kcal;
        this.price = price;
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

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ingredients{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", kcal=" + kcal +
                ", price=" + price +
                '}';
    }
}
