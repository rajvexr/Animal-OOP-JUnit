package org.example.test;

import org.example.Flying;
import org.example.FlyingRat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlyingRatTest {

    @Test
    void get_flyingRatName(){
        FlyingRat flyingrat = new FlyingRat();
        assertEquals("Rat", flyingrat.getName(), "this is not the name");
    }
    @Test
    void get_flyingRatAge(){
        FlyingRat frat2 = new FlyingRat();
        assertEquals(6, frat2.getAge(), "this age is not the name");
    }
    @Test
    void get_flyingRatDead(){
        FlyingRat frat3 = new FlyingRat();
        assertEquals(true, frat3.isDead(), "the flyingRat is not dead");
    }

    @Test
    void get_flyingRatFood(){
        FlyingRat frat4 = new FlyingRat();
        assertEquals("Rat eats insects", frat4.eat(), "the flyingRat is not dead");
    }

    @Test
    void get_flyingRatTakeFlight(){
        FlyingRat frat5 = new FlyingRat();
        assertEquals("Rat is beginning to take flight", frat5.takeFlight(), "the flyingRat is not taking flight");
    }

    @Test
    void get_flyingRatFlight(){
        FlyingRat frat6 = new FlyingRat();
        assertEquals("Rat is flying", frat6.flight(), "the flyingRat is not flying");
    }

    @Test
    void get_flyingRatLanding(){
        FlyingRat frat7 = new FlyingRat();
        assertEquals("Rat is landing", frat7.landing(), "the flyingRat is not landing");
    }

    @Test
    void get_flyingratBreathing(){
        FlyingRat frat8 = new FlyingRat();
        assertEquals("Rat is breathing",frat8.breathe(), "the flying rat is not breathing");
    }

    @Test
    void get_flyingRatBreed(){
        FlyingRat frat9 = new FlyingRat();
        assertEquals("Rat lays eggs", frat9.breed(), "the flying rat is not breeding");
    }

}
