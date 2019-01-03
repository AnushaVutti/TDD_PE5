package com.stackroute.pe5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;


public class StudentClassTest{

    private Driver driver;

    @Before
    public void setUp() throws Exception {
        driver = new Driver();
    }

    @After
    public void tearDown() throws Exception {
        driver=null;
    }

        @Test
        public void sortstudentSuccess() {
            ArrayList<StudentClass> arr=new ArrayList<StudentClass>();
            arr.add(new StudentClass(150,18,"Anusha"));
            arr.add(new StudentClass(130,16,"Rahul"));
            arr.add(new StudentClass(140,16,"Joe"));
            arr.add(new StudentClass(140,16,"Mukul"));
            arr.add(new StudentClass(140,18,"Adam"));
            ArrayList<StudentClass>output=new ArrayList<StudentClass>();
            output.add(new StudentClass(140,16,"Joe"));
            output.add(new StudentClass(140,16,"Mukul"));
            output.add(new StudentClass(130,16,"Rahul"));
            output.add(new StudentClass(140,18,"Adam"));
            output.add(new StudentClass(150,18,"Anusha"));
            assertEquals(output.toString(),driver.sortStudent(arr).toString());
        }
    @Test
    public void sortstudentFailure() {
        ArrayList<StudentClass> arr=new ArrayList<StudentClass>();
        arr.add(new StudentClass(150,18,"Anusha"));
        arr.add(new StudentClass(130,16,"Rahul"));
        arr.add(new StudentClass(140,16,"Joe"));
        arr.add(new StudentClass(140,16,"Mukul"));
        arr.add(new StudentClass(140,18,"Adam"));
        ArrayList<StudentClass>output=new ArrayList<StudentClass>();
        output.add(new StudentClass(140,16,"Mukul"));
        output.add(new StudentClass(140,16,"Joe"));
        output.add(new StudentClass(130,16,"Rahul"));
        output.add(new StudentClass(140,18,"Adam"));
        output.add(new StudentClass(150,18,"Anusha"));
        assertNotSame(output.toString(),driver.sortStudent(arr).toString());
    }
    @Test
    public void sortstudentNotNull() {
        ArrayList<StudentClass> arr=new ArrayList<StudentClass>();
        arr.add(new StudentClass(150,18,"Anusha"));
        arr.add(new StudentClass(130,16,"Rahul"));
        arr.add(new StudentClass(140,16,"Joe"));
        arr.add(new StudentClass(140,16,"Mukul"));
        arr.add(new StudentClass(140,18,"Adam"));
        assertNotNull(driver.sortStudent(arr).toString());
    }
    }

