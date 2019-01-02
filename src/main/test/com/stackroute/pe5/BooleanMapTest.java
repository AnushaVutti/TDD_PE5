package com.stackroute.pe5;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class BooleanMapTest {
    private BooleanMap booleanMap = new BooleanMap();
    @Test
    public void arr_map() {

        String  arr[] = {"a","b","c","d","a","c","c"};
        HashMap<String, Boolean> hashMap = new HashMap<>();
        hashMap.put("a",true);
        hashMap.put("b",false);
        hashMap.put("c",true);
        hashMap.put("d",false);
        assertEquals("Error",hashMap,booleanMap.arrMap(arr));
    }
    @Test
    public void arr_map1() {
        String  arr[] = {"a","b","c","e","a","c","c","d"};
        HashMap<String, Boolean> hashMap = new HashMap<>();
        hashMap.put("a",true);
        hashMap.put("b",false);
        hashMap.put("c",true);
        hashMap.put("d",false);
        hashMap.put("e",false);
        assertEquals("Error",hashMap,booleanMap.arrMap(arr));
    }
    @Test
    public void arr_map2() {
        String  arr[] = {"a","a","a","b","b","b","b","b","c"};
        HashMap<String, Boolean> hashMap = new HashMap<>();
        hashMap.put("a",true);
        hashMap.put("b",true);
        hashMap.put("c",false);

        assertEquals("Error",hashMap,booleanMap.arrMap(arr));
    }
    @Test
    public void arr_mapFailure() {
        String  arr[] = {"a","a","a","b","b","b","b","b","c"};
        assertNotNull("Error",booleanMap.arrMap(arr));
    }

}