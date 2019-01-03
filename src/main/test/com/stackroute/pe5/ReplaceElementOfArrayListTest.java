package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ReplaceElementOfArrayListTest {
    private ReplaceElementOfArrayList replace;

    @Before
    public void setUp() throws Exception {
        replace = new ReplaceElementOfArrayList();
    }

    @After
    public void tearDown() throws Exception {
        replace=null;
    }
    @Test
    public void replacearrayListElementcheckSuccess() {
        ArrayList<String> input = new ArrayList<String>(Arrays.asList(new String[]{"Apple", "Grape", "Melon","Berry"}));
        ArrayList<String> output = new ArrayList<String>(Arrays.asList(new String[]{"Kiwi","Grape","Melon","Berry"}));
        assertEquals(output,replace.replaceElement(input,0,"Kiwi"));
    }
    @Test
    public void replacearrayListElementcheckFailure() {
        ArrayList<String> input = new ArrayList<String>(Arrays.asList(new String[]{"Apple", "Grape", "Melon","Berry"}));
        ArrayList<String> output = new ArrayList<String>(Arrays.asList(new String[]{"Kiwi","Apple","Melon","Berry"}));
        assertNotSame(output,replace.replaceElement(input,0,"Kiwi"));
    }
    @Test
    public void replacearrayListElementcheckNotNull() {
        ArrayList<String> input = new ArrayList<String>(Arrays.asList(new String[]{"Apple", "Grape", "Melon","Berry"}));
        assertNotNull(replace.replaceElement(input,0,"Kiwi"));
    }
    @Test
    public void replacearrayListElementcheckNull() {
        ArrayList<String> input = new ArrayList<String>(Arrays.asList(new String[]{}));
        ArrayList<String> output=replace.replaceElement(input,0,"");
        ArrayList<String> expectedOutput=new ArrayList<>();
      //assertNull(replace.replaceElement(input,0,""));
        assertTrue(output.equals(expectedOutput));
    }

    @Test
    public void clearElementNull() {
        ArrayList<String> input = new ArrayList<String>(Arrays.asList(new String[]{}));
        assertNull(replace.emptyArrayList(input));
    }
}