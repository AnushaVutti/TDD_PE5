package com.stackroute.pe5;

import java.util.HashMap;

public class FrequencyOfElement {
    public HashMap<String,Integer> frequencyCalculation(String input) {
        String[] arr = input.split("[., ?-@*]");
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
        for (String i : arr) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }
        for (HashMap.Entry<String, Integer> val : hm.entrySet()) {
            System.out.println("Element " + val.getKey() + " "
                    + "occurs"
                    + ": " + val.getValue() + " times");
        }
        return hm;
    }


}

