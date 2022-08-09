package org.example;

public class Mouse extends Mammal{


    Mouse(){
        setName("Jerry");
        setHP(50);
    }

    @Override
    String eat() {
        return (getName()+ " eats grains, seeds, and fruits");
    }
}
