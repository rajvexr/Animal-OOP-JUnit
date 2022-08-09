package org.example;

public class Penguin extends Bird{

    public Penguin(){
        setAge(9);
        setName("Bob");
        setDead(false);
    }

    @Override
    public String eat() {
        return (getName()+" eats krill, squids, and fishes");
    }
    
}
