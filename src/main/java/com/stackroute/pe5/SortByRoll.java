package com.stackroute.pe5;
import com.stackroute.pe5.StudentClass;

import java.util.Comparator;

public class SortByRoll implements Comparator<StudentClass> {
    public int compare(StudentClass first, StudentClass second)
    {
        if(first.getAge()!=second.getAge())
            return first.getAge() - second.getAge();
        else
        {
            return first.getName().compareTo(second.getName());
        }
    }
}
