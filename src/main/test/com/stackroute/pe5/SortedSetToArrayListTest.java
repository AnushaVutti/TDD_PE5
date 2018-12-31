package com.stackroute.pe5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class SortedSetToArrayListTest {
    private SortedSetToArrayList list = new SortedSetToArrayList();
    @Test
    public void checkSuccess(){
        ArrayList<String> input = new ArrayList<>();
        input.add("Harry");
        input.add("Olive");
        input.add("Alice");
        input.add("Bluto");
        input.add("Eugene");
        ArrayList<String> output = new ArrayList<>();
        output.add("Alice");
        output.add("Bluto");
        output.add("Eugene");
        output.add("Harry");
        output.add("Olive");
        assertEquals(output,list.sortedSetToArrayListTest(input));
    }
    @Test
    public void checkFailure(){
        ArrayList<String> input = new ArrayList<>();
        input.add("Harry");
        input.add("Olive");
        input.add("Alice");
        input.add("Bluto");
        input.add("Eugene");
        ArrayList<String> output = new ArrayList<>();
        output.add("Alice");
        output.add("Bluto");
        output.add("Eugene");
        output.add("Harry");
        output.add("Green");
        assertNotSame(output,list.sortedSetToArrayListTest(input));
    }
    @Test
    public void checkNotNull(){
        ArrayList<String> input = new ArrayList<>();
        input.add("Harry");
        input.add("Olive");
        input.add("Alice");
        input.add("Bluto");
        input.add("Eugene");
        assertNotNull(list.sortedSetToArrayListTest(input));
    }


}