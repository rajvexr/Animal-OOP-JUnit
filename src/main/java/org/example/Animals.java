package org.example;

import java.lang.reflect.InvocationTargetException;

public abstract class Animals {

    abstract String breathe(); //

    abstract String eat();

    abstract String breed();

    private int age;

    private boolean dead;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public String sleep() {
        return ("the animal is sleeping");
    }

    public String move() {
        return ("the animal is moving");
    }

    public String poop() {
        return ("the animal is pooping");
    }


    void checkAge() {
        if (getAge() < 0) {
            throw new IllegalArgumentException("Age cannot be a negative value");
        }
    }
}
