package com.metube.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class RoverTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public RoverTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(RoverTest.class);
    }

    /**
     * Testing Rover creation and initial location
     */
    public void testRoverCreation() {
    	Rover rover = new Rover(0,0,"N");
        assertEquals(rover.get_x_coordinate(),0);
        assertEquals(rover.get_y_coordinate(),0);
        assertEquals(rover.get_heading(),"N");
    }
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
    public void testRoverTurnAround() {
    	Rover rover = new Rover(0,0,"N");
    	assertEquals(rover.get_heading(),"N");
    	rover.execute_order("R");
    	rover.execute_order("R");
    	assertEquals(rover.get_heading(),"S");
    }
}
