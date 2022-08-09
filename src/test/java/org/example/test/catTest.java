package org.example.test;

import org.example.Cat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class catTest {

    @Test
    public void get_cat_getAge(){
        Cat cat = new Cat();
        assertEquals(5, cat.getAge(), "That not the same age");

    }
    @Test
    public void get_canEater(){
        Cat cat2 = new Cat();
        assertEquals("Dave is a meat eater", cat2.eat(), "This is not it");

    }
    @Test
    public void get_sleeping(){
        Cat cat3 = new Cat();
        assertEquals("the animal is sleeping", cat3.sleep(), "the animal is not sleeping");
    }
    @Test
    public void get_catName(){
        Cat cat4 = new Cat();
        assertEquals("Dave", cat4.getName(), "That is not the cats name");
    }
    @Test
    public void get_killTotal(){
        Cat cat5 = new Cat();
        assertEquals(4, cat5.getKillTotal(), "the cat didn't kill that many times!");

    }
    @Test
    public void is_dead(){
        Cat cat6 = new Cat();
        assertEquals(true, cat6.isDead(), "the cat is not dead");
    }

}
