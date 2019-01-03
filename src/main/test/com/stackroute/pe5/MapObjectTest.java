package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

import static org.junit.Assert.*;

public class MapObjectTest {
    private MapObject map;

    @Before
    public void setUp() throws Exception {
        map = new MapObject();
    }

    @After
    public void tearDown() throws Exception {
        map=null;
    }

    @Test
    public void modifySuccess() {
        LinkedHashMap<String ,String> hashMap=new LinkedHashMap<>();
        hashMap.put("val1","java");
        hashMap.put("val2","c++");
        HashMap<String ,String> result=new HashMap<>();
        result.put("val1"," ");
        result.put("val2","java");
        assertEquals(result,map.modifyKey(hashMap));
    }
    @Test
    public void modifyFailure() {
        LinkedHashMap<String ,String> hashMap=new LinkedHashMap<>();
        hashMap.put("val1","java");
        hashMap.put("val2","c++");
        HashMap<String ,String> result=new HashMap<>();
        result.put("val1"," ");
        result.put("val2","c++");
        assertNotSame(result,map.modifyKey(hashMap));
    }

    @Test
    public void modifyNotNull() {
        LinkedHashMap<String ,String> hashMap=new LinkedHashMap<>();
        hashMap.put("val1","java");
        hashMap.put("val2","c++");
        assertNotNull(map.modifyKey(hashMap));
    }
    @Test
    public void modifyNull() {
        LinkedHashMap<String ,String> hashMap=new LinkedHashMap<>();
        assertNull(map.modifyKey(hashMap));
    }

}