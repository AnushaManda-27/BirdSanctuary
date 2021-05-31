package com.bridgelabz.bridsanctuary;

public class Application {
    public static void main(String[] args) {
        System.out.println("Welcome to Bird Sanctuary");

        BirdSanctuary birdSanctuary =new BirdSanctuary();

        Parrot parrot1 = new Parrot("p1");
        Parrot parrot2 = new Parrot("p2");
        Parrot parrot3 = new Parrot("p3");

        Duck duck1 = new Duck("d1");
        Duck duck2 = new Duck("d2");
        Duck duck3 = new Duck("d3");
        Penguin penguin1 = new Penguin("pen1");
        Penguin penguin2 = new Penguin("pen2");
        Penguin penguin3 = new Penguin("pen3");

        try {
            birdSanctuary.add(parrot1);
        } catch (Exception e1) {
            e1.printStackTrace();
        }

        try {
            birdSanctuary.add(parrot2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            birdSanctuary.add(parrot3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            birdSanctuary.add(duck1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            birdSanctuary.add(duck2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            birdSanctuary.add(duck3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            birdSanctuary.add(penguin1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            birdSanctuary.add(penguin2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            birdSanctuary.add(penguin3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            birdSanctuary.add(null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        birdSanctuary.remove(parrot3);
        birdSanctuary.remove(duck3);
        birdSanctuary.remove(penguin3);

        birdSanctuary.print();

        birdSanctuary.printEatable();
        birdSanctuary.printFlyable();
        birdSanctuary.printSwimmable();

        System.out.println("Parrot count" +Parrot.count);
        System.out.println("Duck count" +Duck.count);
        System.out.println("Penguin count" +Penguin.count);
        System.out.println("total count of birds" +Birds.totalCount);
    }
}
