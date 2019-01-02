package com.stackroute.pe5;

import java.util.HashMap;

public class BooleanMap {
    public HashMap<String, Boolean>arrMap(String [] str ) {
        HashMap<String, Boolean> hashMap = new HashMap<>();
        for(int i=0;i<str.length;i++)
        {
            if(hashMap.get(str[i])==null)
            {
                hashMap.put(str[i],false);
            }
            else
                hashMap.put(str[i],true);


        }
        return hashMap;

    }
}
