package org.example;

public abstract class Bird extends Animals{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    String breathe() {
        return (this.name+" is breathing");
    }

    @Override
    String breed() {
        return (this.name+" lays eggs");
    }
}
