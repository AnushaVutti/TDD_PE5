package com.stackroute.pe5;

import java.util.ArrayList;

public class ReplaceElementOfArrayList {

    public ArrayList<String> replaceElementOfArrayList(ArrayList<String> original,int index,String newString) {
        original.set(index,"Kiwi");
        System.out.println("Arraylist after replacing : " + original);
        return original;
    }
    public ArrayList<String> emptyArrayList(ArrayList<String> original) {
       original.clear();
        System.out.println("Arraylist after emptying : " + original);
        return original;
    }

}
