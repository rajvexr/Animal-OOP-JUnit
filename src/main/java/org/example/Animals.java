package org.example;

import java.lang.reflect.InvocationTargetException;

public abstract class Animals {

    abstract String breathe();

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

    public <T extends Animals> Animals breed(Animals partner ){
        Animals babyAnimal = null;
        try {
            babyAnimal = partner.getClass().getDeclaredConstructor().newInstance();
        }
        catch(Exception e){

        }
        finally {
            return babyAnimal;
        }
    }

    public <T extends Animals> Animals breeds(Animals partner ) throws IllegalAccessException, NoSuchMethodException, InstantiationException,IllegalArgumentException, InvocationTargetException {
        Animals babyAnimal = null;

        return babyAnimal = partner.getClass().getDeclaredConstructor().newInstance();
    }

    void checkAge() {
        if (getAge() < 0) {
            throw new IllegalArgumentException("Age cannot be a negative value");
        }
    }
}
