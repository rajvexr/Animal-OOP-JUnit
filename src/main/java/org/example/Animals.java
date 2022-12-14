package org.example;

public abstract class Animals {

    abstract String breathe(); //

    abstract String eat();

    abstract String breed();

    private int age;

    private String gender;

    private boolean dead;

    private int HP;

    private int attack;

    public Animals(){

    }


    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

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

    public void animalAttack(int HP, int attack){

    }

    void checkAge() {
        if (getAge() < 0) {
            throw new IllegalArgumentException("Age cannot be a negative value");
        }
    }
}
