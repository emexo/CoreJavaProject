package com.emexo.oops.ploymorphism;

public class TestMain {
    public static void main(String[] args) {
        Trainer trainer = new Trainer();

        Animal dog = new Dog();

        Animal bird = new Bird();

        Animal fish = new Fish();

        trainer.teach(dog);
        trainer.teach(bird);
        trainer.teach(fish);
    }
}
