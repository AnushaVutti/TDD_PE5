package com.stackroute.pe5;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Comparator;
public class StudentClass {
    private int id;
    private int age;
    private String name;

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
    public StudentClass(int id,int age,String name)
    {
        this.id=id;
        this.age=age;
        this.name=name;
    }
    public String toString()
    {
        return this.id + " " + this.age +
                " " + this.name;
    }
}

