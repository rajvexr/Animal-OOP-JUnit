package org.example;

public class Bat extends Mammal implements Flying{

    public Bat(){
        setName("flying creature");
        setAge(3);
        setDead(false);
    }

    @Override
    public String eat() {
        return (getName()+" eats night-flying insects");
    }

    @Override
    public String takeFlight() {
        return(getName()+ " takes flight");
    }

    @Override
    public String flight() {
        return(getName()+ " is flying at night");
    }

    @Override
    public String landing() {
        return(getName()+" is beginning to land");
    }
}
