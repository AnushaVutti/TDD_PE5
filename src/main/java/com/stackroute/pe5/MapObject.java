package com.stackroute.pe5;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapObject {

        public LinkedHashMap<String,String > modifyKey(LinkedHashMap<String,String> hashMap)
        {
            if (hashMap.size()==0)
            return null;

            Iterator hmIterator = hashMap.entrySet().iterator();
            Map.Entry mapElement = (Map.Entry)hmIterator.next();
            String key1=(String)mapElement.getKey();
            String value1=(String)mapElement.getValue();

            mapElement = (Map.Entry)hmIterator.next();

            String key2=(String)mapElement.getKey();
            String value2=(String)mapElement.getValue();

            if(value1!=null) {
                value2 = value1;
                hashMap.put(key1," ");
                hashMap.put(key2,value2);

            }
            System.out.println(hashMap);
            return hashMap;


        }
    }

