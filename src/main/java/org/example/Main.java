package org.example;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();

        Animals cat2 = cat.breed(cat);
        Cat cat3 = (Cat) cat.breed(cat);
        try{
            Cat cat4 = (Cat) cat2.breeds(cat3);

        }
        catch(Exception e){
            System.out.println("Breeding has not occured");
        }

/*
            try{
                cat.setAge(-5);
                cat.checkAge();
            }
            catch(Exception e){
            System.out.println(cat.getName()+ " age cannot be negative");
        }
  */

    }
}