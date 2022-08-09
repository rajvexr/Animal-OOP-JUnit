package org.test;

import org.example.Bat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BatTest {

    @Test
    public void get_batName(){
        Bat bat = new Bat();
        assertEquals("flying creature", bat.getName());

    }

}
