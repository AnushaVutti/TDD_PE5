package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class BooleanMapTest {
    private BooleanMap booleanMap;

    @Before
    public void setUp() throws Exception {
        booleanMap = new BooleanMap();
    }

    @After
    public void tearDown() throws Exception {
        booleanMap=null;
    }

    @Test
    public void arrayMapSuccess() {

        String  input[] = {"a","b","a","d","a","d","c"};
        HashMap<String, Boolean> hashMap = new HashMap<>();
        hashMap.put("a",true);
        hashMap.put("b",false);
        hashMap.put("c",false);
        hashMap.put("d",true);
        assertEquals(hashMap,booleanMap.arrMap(input));
    }
    @Test
    public void arrayMapFailure() {
        String  input[] = {"a","b","e","e","a","c","d","d"};
        HashMap<String, Boolean> hashMap = new HashMap<>();
        hashMap.put("a",true);
        hashMap.put("b",false);
        hashMap.put("c",true);
        hashMap.put("d",false);
        hashMap.put("e",true);
        assertNotSame(hashMap,booleanMap.arrMap(input));
    }
    @Test
    public void arrayMapNull() {
        String  input[] = {};
        assertNull(booleanMap.arrMap(input));

    }
    @Test
    public void arrayMapNotNull() {
        String  input[] = {"a","b","e","e","a","c","d","d"};
        assertNotNull(booleanMap.arrMap(input));

    }

}