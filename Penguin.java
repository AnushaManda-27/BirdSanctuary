package com.bridgelabz.bridsanctuary;

public class Penguin extends Birds implements Swimmable {

    static int count;

    Penguin(String id){
        this.id=id;
    }
    @Override
    public String toString(){
        return "Penguin [id=" + id + "]";
    }
    @Override
    public void eat(){
        System.out.println("penguin is eating");
    }

    @Override
    public void swim(){
        System.out.println("penguin is swimming");
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

