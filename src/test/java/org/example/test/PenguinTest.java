package org.example.test;

import org.example.Penguin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PenguinTest {

    @Test
    public void get_PenguinFood() {
        Penguin penguin = new Penguin();
        assertEquals("Bob eats krill, squids, and fishes", penguin.eat(), "the penguin is not eating");
    }

    @Test
    public void get_PenguinPoop(){
        Penguin penguin2 = new Penguin();
        assertEquals("the animal is pooping", penguin2.poop(), "the penguin is not pooping");
    }

    @Test
    public void get_PenguinMove(){
        Penguin penguin3 = new Penguin();
        assertEquals("the animal is moving", penguin3.move(), "the penguin is not moving");
    }

    @Test
    public void get_PenguinCheckAge(){
        Penguin penguin4 = new Penguin();
        assertEquals(9, penguin4.getAge());
    }

}