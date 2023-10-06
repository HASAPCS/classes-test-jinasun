package com.example;

import java.util.ArrayList;

public class Basket {
    private int capacity;
    private ArrayList<Fruit> fruits;

    public Basket(int capacity) {
        this.capacity = capacity;
        this.fruits = new ArrayList<Fruit>();
        // TODO: Initialize the attributes (and initialize the fruits list)
    }

    public void addFruit(Fruit fruit) {
        if (this.fruits.size()<this.capacity){
            fruits.add(fruit);
        }

        // TODO: Add the fruit to the basket IF THERE IS SPACE!
    }

    public void removeFruit(Fruit fruit) {
        fruits.remove(fruit);
        // TODO: Remove the fruit from the basket
    }


    public int getCapacity(){
        return this.capacity;
    }

    public void setCapacity(int newCapacity){
        this.capacity = newCapacity;
    }
    
    public  ArrayList<Fruit>getFruits(){
        return this.fruits;
    }

    public void setFruits(ArrayList <Fruit> newFruits){
        this.fruits = newFruits;
    }
    // TODO: Implement getters, setters, and any other methods you find necessary
}
