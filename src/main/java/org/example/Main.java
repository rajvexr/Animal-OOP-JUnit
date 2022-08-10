package org.example;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();

            try{
                cat.setAge(-5);
                cat.checkAge();
            }
            catch(Exception e){
            System.out.println(cat.getName()+ " age cannot be negative");
        }

    }

    }

