package com.bootcampexcercise.module6.activity;

/**
 * Mammal class
 */
public class Mammal {

    private Animal myAnimal;
    private String name;

    // constructor
    public Mammal(String name) {
        this.name = name;
    }

    public void setAnimal(Animal animal) {
        myAnimal = animal;
    }

    public void animalIsSleeping() {
        System.out.println("Animal with name: " + name + " is ...");
        myAnimal.sleep();   // 👈 calls interface method
    }

    public void animalIsSpeaking() {
        System.out.println("Animal with name: " + name + " is ...");
        myAnimal.animalSound();   // 👈 calls interface method
    }
}