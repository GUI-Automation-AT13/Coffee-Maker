package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Implementation;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class InputsTest {

    @Test
    public void scannerTest() {
        Inputs inputs = new Inputs();
        String input = "6";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(input, inputs.scanner());
    }
}