package com.bootcampexcercise.module6.activity;

/**
 * Main class
 */



/**
 * output
 *
 * Animal with name: MyPet is ...
 * Cat is sleeping!
 * Animal with name: MyPet is ...
 * Cat says: 'Meow Meow'!
 * ----------------------
 * Animal with name: MyPet is ...
 * Dog is sleeping!
 * Animal with name: MyPet is ...
 * Dog says: 'Woof Woof'!
 *
 */

public class AnimalActivity {

    public static void main(String arg[]) {

        // use interface type
        Animal cat = new Cat();
        Animal dog = new Dog();

        // create Mammal
        Mammal mammal = new Mammal("MyPet");

        // set cat
        mammal.setAnimal(cat);
        mammal.animalIsSleeping();
        mammal.animalIsSpeaking();

        System.out.println("----------------------");

        // set dog
        mammal.setAnimal(dog);
        mammal.animalIsSleeping();
        mammal.animalIsSpeaking();
    }
}