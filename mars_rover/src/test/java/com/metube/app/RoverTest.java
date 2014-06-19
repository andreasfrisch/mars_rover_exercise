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
        assertTrue(rover.get_x_coordinate() == 0);
        assertTrue(rover.get_y_coordinate() == 0);
        assertEquals(rover.get_heading(),"N");
    }
}
