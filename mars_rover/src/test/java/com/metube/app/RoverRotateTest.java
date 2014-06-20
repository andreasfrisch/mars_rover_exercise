package com.metube.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple Rover rotation.
 */
public class RoverRotateTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public RoverRotateTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(RoverRotateTest.class);
    }

    /**
     * Testing Rover rotation left and right
     */
    public void testRoverRotateLeft() {
    	Rover rover = new Rover(0,0,"N");
    	assertEquals(rover.get_heading(),"N");
    	rover.execute_order("L");
    	assertEquals(rover.get_heading(),"W");
    }
    public void testRoverRotateRight() {
    	Rover rover = new Rover(0,0,"N");
    	assertEquals(rover.get_heading(),"N");
    	rover.execute_order("R");
    	assertEquals(rover.get_heading(),"E");
    }
    public void testRoverTurnAroundRight() {
    	Rover rover = new Rover(0,0,"N");
    	assertEquals(rover.get_heading(),"N");
    	rover.execute_order("R");
    	rover.execute_order("R");
    	assertEquals(rover.get_heading(),"S");
    }
    public void testRoverTurnAroundLeft() {
    	Rover rover = new Rover(0,0,"N");
    	assertEquals(rover.get_heading(),"N");
    	rover.execute_order("L");
    	rover.execute_order("L");
    	assertEquals(rover.get_heading(),"S");
    }
}
