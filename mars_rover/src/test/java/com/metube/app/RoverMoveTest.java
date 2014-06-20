package com.metube.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for Rover movement.
 */
public class RoverMoveTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public RoverMoveTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(RoverMoveTest.class);
    }

    /**
     * Testing Rover movement forward in all directions
     */
    public void testRoverMoveAheadNorth() {
    	Rover rover = new Rover(0,0,"N");
    	assertEquals(rover.get_y_coordinate(),0);
    	assertEquals(rover.get_x_coordinate(),0);
    	assertEquals(rover.get_heading(),"N");
    	rover.execute_order("M");
    	assertEquals(rover.get_y_coordinate(),1);
    	assertEquals(rover.get_x_coordinate(),0);
    	assertEquals(rover.get_heading(),"N");
    }
    public void testRoverMoveAheadSouth() {
    	Rover rover = new Rover(0,3,"S");
    	assertEquals(rover.get_y_coordinate(),3);
    	assertEquals(rover.get_x_coordinate(),0);
    	assertEquals(rover.get_heading(),"S");
    	rover.execute_order("M");
    	assertEquals(rover.get_y_coordinate(),2);
    	assertEquals(rover.get_x_coordinate(),0);
    	assertEquals(rover.get_heading(),"S");
    }
    public void testRoverMoveAheadEast() {
    	Rover rover = new Rover(0,0,"E");
    	assertEquals(rover.get_y_coordinate(),0);
    	assertEquals(rover.get_x_coordinate(),0);
    	assertEquals(rover.get_heading(),"E");
    	rover.execute_order("M");
    	assertEquals(rover.get_y_coordinate(),0);
    	assertEquals(rover.get_x_coordinate(),1);
    	assertEquals(rover.get_heading(),"E");
    }
    public void testRoverMoveAheadWest() {
    	Rover rover = new Rover(1,0,"W");
    	assertEquals(rover.get_y_coordinate(),0);
    	assertEquals(rover.get_x_coordinate(),1);
    	assertEquals(rover.get_heading(),"W");
    	rover.execute_order("M");
    	assertEquals(rover.get_y_coordinate(),0);
    	assertEquals(rover.get_x_coordinate(),0);
    	assertEquals(rover.get_heading(),"W");
    }
}
