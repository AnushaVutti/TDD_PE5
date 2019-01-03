package com.stackroute.pe5;
import com.stackroute.pe5.StudentClass;
import com.stackroute.pe5.SortByRoll;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Driver {
    public  static ArrayList<StudentClass> sortStudent(ArrayList<StudentClass>array)
    {
        if (array==null)
            return null;
        Collections.sort(array,new SortByRoll());
        return  array;
    }
    public static void main (String[] args)
    {
        ArrayList<StudentClass>arr=new ArrayList<StudentClass>();
        arr.add(new StudentClass(150,18,"Anusha"));
        arr.add(new StudentClass(130,16,"Rahul"));
        arr.add(new StudentClass(140,16,"Mukul"));
        arr.add(new StudentClass(140,16,"Joe"));
        arr.add(new StudentClass(140,18,"Adam"));


        Iterator<StudentClass> custIterator = arr.iterator();

        System.out.println("Before Sorting:\n");
        while (custIterator.hasNext()) {
            System.out.println(custIterator.next());
        }

        ArrayList<StudentClass>result =sortStudent(arr);

        Iterator<StudentClass> custIterator1 = arr.iterator();

        System.out.println("Before Sorting:\n");
        while (custIterator1.hasNext()) {
            System.out.println(custIterator1.next());
        }


    }

}
