package com.bootcampexcercise.module9.activity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

        private Person person;

        //TODO: create set up
        protected void setUp() throws Exception {
            super.setUp();
            person = new Person();
        }
        //TODO: create teardown
        protected void tearDown() throws Exception {
            person = null;
            super.tearDown();
        }
        //TODO: create unit tests for getters and setters

    public void testHeight177() {
        float testHeight = 1.77F;
        person.setHeight(testHeight);
        assertEquals(testHeight, person.getHeight());
    }

    public void testHeight148(){
            float testHeight = 1.48F;
            person.setHeight(testHeight);
            assertEquals(testHeight, person.getHeight());
    }
    public void testWeight205(){
            int testWeight = 205;
            person.setWeight(testWeight);
            assertEquals(testWeight, person.getWeight());
    }
    public void testWeight54(){
            int testWeight = 54;
            person.setWeight(testWeight);
            assertEquals(testWeight, person.getWeight());
    }

    //TODO: create unit test for getBodyMassIndex method

    public void testBMI1(){
           int testWeight = 58;
           float testHeight = 1.77F;
           assertEquals("18.513199", person.calculateBMI(testWeight, testHeight));
    }

    public void testBMI2(){
        int testWeight = -52;
        float testHeight = 1.6F;
        assertEquals("Value shouldn't be negative and zero", person.calculateBMI(testWeight, testHeight));
    }

    public void testBMI3(){
        int testWeight = 1000;
        float testHeight = 3.77F;
        assertEquals("31.919308", person.calculateBMI(testWeight, testHeight));
    }
}