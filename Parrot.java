package com.bridgelabz.bridsanctuary;

public class Parrot extends Birds implements Flyable {

    static int count;

    Parrot(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Parrot [id=" + id + "]";
    }

    @Override
    public void eat() {
        System.out.println("parrot is eating");
    }

    @Override
    public void incrementCount() {
        count++;
    }

    @Override
    public void fly() {
        System.out.println("parrot is flying");
    }

    @Override
    public void decrementCount(){
        count--;
    }

}

