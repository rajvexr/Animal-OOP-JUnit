package org.example;

public class Cat extends Mammal{

    private int killTotal;
    int attack = 10;


    public int getKillTotal() {
        return killTotal;
    }

    public void setKillTotal(int killTotal) {
        this.killTotal = killTotal;
    }

    public Cat(){
        setAge(5);
        setName("Dave");
        setKillTotal(4);
        setDead(true);
    }

    @Override
    public String eat() {
        return (getName()+" is a meat eater");
    }

    void CatAttacks(){

    }

    void CatKillsMouse(){


    }



}
