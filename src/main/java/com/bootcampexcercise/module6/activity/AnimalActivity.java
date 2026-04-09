package com.bootcampexcercise.module6.activity;

public class AnimalActivity {
    public static void main(String[] args){
        Animal dog = new Dog();
        Animal cat = new Cat();
        Mammal myMammal = new Mammal("Jack");
        myMammal.setAnimal(cat);
        myMammal.animalsSleeping();
        myMammal.animalsSpeaking();


        myMammal.setAnimal(dog);
        myMammal.animalsSleeping();
        myMammal.animalsSpeaking();
    }
}
