package org.example;

public abstract class Mammal extends Animals {

    private String name;

    private int HP;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    @Override
    String breathe() {
        return (this.name + " is breathing");
    }

    @Override
    String breed() {
        return (this.name+ " is having a Live birth");
    }


    }




