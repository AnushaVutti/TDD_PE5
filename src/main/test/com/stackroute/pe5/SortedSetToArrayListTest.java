package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SortedSetToArrayListTest {
    private SortedSetToArrayList list;

    @Before
    public void setUp() throws Exception {
        list = new SortedSetToArrayList();
    }

    @After
    public void tearDown() throws Exception {
        list=null;
    }
    @Test
    public void checkSuccess(){
        ArrayList<String> input= new ArrayList<String>(Arrays.asList(new String[]{"Harry", "Bluto", "Eugene","Alice","Olive"}));
        ArrayList<String> output= new ArrayList<String>(Arrays.asList(new String[]{"Alice", "Bluto", "Eugene","Harry","Olive"}));
        assertEquals(output,list.sortedSet(input));
    }
    @Test
    public void checkFailure(){
        ArrayList<String> input= new ArrayList<String>(Arrays.asList(new String[]{"Harry", "Bluto", "Eugene","Alice","Olive"}));
        ArrayList<String> output= new ArrayList<String>(Arrays.asList(new String[]{"Alice", "Bluto", "Eugene","Olive","Harry"}));
        assertNotSame(output,list.sortedSet(input));
    }
    @Test
    public void checkNotNull(){
        ArrayList<String> input= new ArrayList<String>(Arrays.asList(new String[]{"Harry", "Bluto", "Eugene","Alice","Olive"}));
        assertNotNull(list.sortedSet(input));
    }
    @Test
    public void checkNull(){
        ArrayList<String> input = new ArrayList<String>(Arrays.asList(new String[]{}));
        assertNull(list.sortedSet(input));
    }


}