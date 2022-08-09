package org.example;

public class FlyingRat extends Bird implements Flying{

    public FlyingRat(){
        setName("Rat");
        setAge(6);
        setDead(true);
    }

    @Override
    public String eat() {
        return (getName()+" eats insects");
    }

    @Override
    public String takeFlight() {
        return(getName() +" is beginning to take flight");
    }

    @Override
    public String flight() {
        return(getName()+" is flying");
    }

    @Override
    public String landing() {
        return(getName()+" is landing");
    }
}
