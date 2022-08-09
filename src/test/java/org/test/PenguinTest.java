package org.test;

import org.example.Penguin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PenguinTest {

    @Test
    public void get_PenguinFood(){
        Penguin penguin = new Penguin();
        assertEquals("Bob eats krill, squids, and fishes", penguin.eat());
    }

}
