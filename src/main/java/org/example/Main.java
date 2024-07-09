package org.example;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(1,"Maysie","Katze",2);
        System.out.println(animal);


        Animal animal2 = new Animal(2,"Sammy","Katze",2);
        System.out.println(animal2);

        System.out.println(animal.equals(animal2));


        System.out.println(animal.toString());


    }
}


