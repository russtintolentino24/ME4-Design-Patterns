package com.company;

public class TestCloning {

    public static void main(String[] args){

        // Handles routing makeCopy method calls to the
        // right subclasses of Animal

        CloneFactory animalMaker = new CloneFactory();

        // Creates a new Sheep instance

        Goat Bally = new Goat();

        // Creates a clone of Sally and stores it in its own
        // memory location

        Goat clonedGoat = (Goat) animalMaker.getClone(Bally);

        // These are exact copies of each other

        System.out.println(Bally);

        System.out.println(clonedGoat);

        System.out.println("Bally HashCode: " + System.identityHashCode(System.identityHashCode(Bally)));

        System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(clonedGoat)));
    }

}