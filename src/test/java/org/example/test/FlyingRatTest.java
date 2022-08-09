package org.example.test;

import org.example.Flying;
import org.example.FlyingRat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlyingRatTest {

    @Test
    public void get_flyingRatName(){
        FlyingRat flyingrat = new FlyingRat();
        assertEquals("Rat", flyingrat.getName(), "this is not the name");
    }
    @Test
    public void get_flyingRatAge(){
        FlyingRat frat2 = new FlyingRat();
        assertEquals(6, frat2.getAge(), "this age is not the name");
    }
    @Test
    public void get_flyingRatDead(){
        FlyingRat frat3 = new FlyingRat();
        assertEquals(true, frat3.isDead(), "the flyingRat is not dead");
    }

    @Test
    public void get_flyingRatFood(){
        FlyingRat frat4 = new FlyingRat();
        assertEquals("Rat eats insects", frat4.eat(), "the flyingRat is not dead");
    }

    @Test
    public void get_flyingRatTakeFlight(){
        FlyingRat frat5 = new FlyingRat();
        assertEquals("Rat is beginning to take flight", frat5.takeFlight(), "the flyingRat is not taking flight");
    }

    @Test
    public void get_flyingRatFlight(){
        FlyingRat frat6 = new FlyingRat();
        assertEquals("Rat is flying", frat6.flight(), "the flyingRat is not flying");
    }

    @Test
    public void get_flyingRatLanding(){
        FlyingRat frat7 = new FlyingRat();
        assertEquals("Rat is landing", frat7.landing(), "the flyingRat is not landing");
    }



}
