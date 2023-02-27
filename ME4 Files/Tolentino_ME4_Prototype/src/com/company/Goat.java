package com.company;

public class Goat implements Animal {

    public Goat(){

        System.out.println("Goat is Made");

    }

    public Animal makeCopy() {

        System.out.println("Goat is Being Made");

        Goat goatObject = null;

        try {

            // Calls the Animal super classes clone()
            // Then casts the results to Sheep

            goatObject = (Goat) super.clone();

        }

        // If Animal didn't extend Cloneable this error
        // is thrown

        catch (CloneNotSupportedException e) {

            System.out.println("The Goat was Turned to ashes");

            e.printStackTrace();

        }

        return goatObject;
    }

    public String toString(){

        return "I'm the GOAT";

    }

}