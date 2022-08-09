package org.test;

import org.example.Bat;
import org.example.FlyingRat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BatTest {

    @Test
    public void get_batName(){
        Bat bat = new Bat();
        assertEquals("flying creature", bat.getName());
    }
    @Test
    public void get_batAge(){
        Bat bat2 = new Bat();
        assertEquals(3, bat2.getAge());
    }
    @Test
    public void get_batDead(){
        Bat bat3 = new Bat();
        assertEquals(false, bat3.isDead());
    }
    @Test
    public void get_batFood(){
        Bat bat4 = new Bat();
        assertEquals("flying creature eats night-flying insects", bat4.eat(), "the bat is not hungry");
    }

    @Test
    public void get_batTakeFlight(){
        Bat bat5 = new Bat();
        assertEquals("flying creature takes flight", bat5.takeFlight(), "the bat is not taking flight");
    }

    @Test
    public void get_batFlight(){
        Bat bat6 = new Bat();
        assertEquals("flying creature is flying at night", bat6.flight(), "the bat is not flying");
    }

    @Test
    public void get_batLanding(){
        Bat bat7 = new Bat();
        assertEquals("flying creature is beginning to land", bat7.landing(), "the bat is not landing");
    }

}
