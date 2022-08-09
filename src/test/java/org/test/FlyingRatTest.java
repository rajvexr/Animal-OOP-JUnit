package org.test;

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


}
