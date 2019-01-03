package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SortedSetToArrayList {

    public ArrayList<String> sortedSet(ArrayList<String> input) {
        if (input.size()==0)
            return null;

        Set<String>inputSet = new TreeSet<>(input);
        for (String item : inputSet ) {
            System.out.print(item + " ");
        }
        ArrayList<String> arrayList = new ArrayList<String>(inputSet);
        return arrayList;

    }
}
