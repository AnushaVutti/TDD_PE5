package com.stackroute.pe5;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class FrequencyOfElementTest {
    private FrequencyOfElement frequency = new FrequencyOfElement();
    @Test
    public void checkSuccess() {
        String input = "one one one.two,three,one@three*one?two";
        HashMap<String,Integer> output = new HashMap<String, Integer>();
        output.put("one",5);
        output.put("two",2);
        output.put("three",2);
        assertEquals(output,frequency.frequencyCalculation(input));
    }
    @Test
    public void checkFailure() {
        String input = "one one one.two,three,one@three*one?two";
        HashMap<String,Integer> output = new HashMap<String, Integer>();
        output.put("one",5);
        output.put("two",2);
        output.put("three",2);
        assertEquals(output,frequency.frequencyCalculation(input));
    }
    @Test
    public void checkNotNull() {
        String input = "one one one.two,three,one@three*one?two";
        HashMap<String,Integer> output = new HashMap<String, Integer>();
        assertNotNull(frequency.frequencyCalculation(input));
    }

}