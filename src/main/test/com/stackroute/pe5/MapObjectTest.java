package com.stackroute.pe5;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

import static org.junit.Assert.*;

public class MapObjectTest {
    private MapObject map = new MapObject();
    @Test
    public void modifySuccess() {
        LinkedHashMap<String ,String> hashMap=new LinkedHashMap<>();
        hashMap.put("val1","java");
        hashMap.put("val2","c++");
        HashMap<String ,String> res=new HashMap<>();
        res.put("val1"," ");
        res.put("val2","java");
        assertEquals(res,map.modify(hashMap));
    }
    @Test
    public void modifyFailure() {
        LinkedHashMap<String ,String> hashMap=new LinkedHashMap<>();
        hashMap.put("val1","java");
        hashMap.put("val2","c++");
        HashMap<String ,String> res=new HashMap<>();
        res.put("val1"," ");
        res.put("val2","c++");
        assertNotSame(res,map.modify(hashMap));
    }

    @Test
    public void modifyNotNUll() {
        LinkedHashMap<String ,String> hashMap=new LinkedHashMap<>();
        hashMap.put("val1","java");
        hashMap.put("val2","c++");
        assertNotNull("Error",map.modify(hashMap));
    }

}