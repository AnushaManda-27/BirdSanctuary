package com.bridgelabz.bridsanctuary;

public class Duck extends Birds implements Flyable,Swimmable {

    static int count;

    Duck(String id){
        this.id = id;
    }

    @Override
    public String toString(){
        return "duck [id=" + id + "]";
    }

    @Override
    public void eat(){
        System.out.println("duck is eating");
    }

    @Override
    public void fly() {
        System.out.println("duck is Flying");
    }

    @Override
    public void swim() {
        System.out.println("duck is swimming");
    }

    @Override
    public void incrementCount() {
        count++;
    }

    @Override
    public void decrementCount(){
        count--;
    }
}
