package com.stackroute.pe5;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ReplaceElementOfArrayListTest {
    private ReplaceElementOfArrayList replace = new ReplaceElementOfArrayList();
    @Test
    public void replacearrayListElementcheckSuccess() {
        ArrayList<String> input = new ArrayList<String>();
        input.add("Apple");
        input.add("Grape");
        input.add("Melon");
        input.add("Berry");
        ArrayList<String> output = new ArrayList<String>();
        output.add("Kiwi");
        output.add("Grape");
        output.add("Melon");
        output.add("Berry");
        assertEquals(output,replace.replaceElementOfArrayList(input,0,"Kiwi"));
    }
    @Test
    public void replacearrayListElementcheckFailure() {
        ArrayList<String> input = new ArrayList<String>();
        input.add("Apple");
        input.add("Grape");
        input.add("Melon");
        input.add("Berry");
        ArrayList<String> output = new ArrayList<String>();
        output.add("Kiwi");
        output.add("Apple");
        output.add("Melon");
        output.add("Berry");
        assertNotSame(output,replace.replaceElementOfArrayList(input,0,"Kiwi"));
    }
    @Test
    public void replacearrayListElementcheckNotNull() {
        ArrayList<String> input = new ArrayList<String>();
        input.add("Apple");
        input.add("Grape");
        input.add("Melon");
        input.add("Berry");
        assertNotNull(replace.replaceElementOfArrayList(input,0,"Kiwi"));
    }
    @Test
    public void clearElementNull() {
        ArrayList<String> input = new ArrayList<String>();
        input.add("Apple");
        input.add("Grape");
        input.add("Melon");
        input.add("Berry");
        assertNotNull(replace.emptyArrayList(input));
    }
}