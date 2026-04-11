package com.bootcampexcercise.module9.activity;

import junit.framework.TestCase;



public class PersonTest extends TestCase {
    private Person person;

    @Override protected void setUp(){
        person = new Person();
    }

    @Override protected void tearDown(){
        person = null;
    }

    public void testSetAndGetWeight(){
        person.setWeight(70);
        assertEquals(70, person.getWeight());
    }

    public void testSetAndGetHeight(){
        person.setHeight(1.6f);
        assertEquals(1.6f, person.getHeight());
    }

    public void testBodyGetMassIndexValid(){
        assertEquals("22.85714340209961", Person.getBodyMassIndex(70, 1.75f));
    }


    public void testGetBodyMassIndexInvalid(){
        assertEquals("Invalid parameters", Person.getBodyMassIndex(-5, 1.6f));
    }
}
