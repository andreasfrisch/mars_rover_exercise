package com.metube.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for the InstructionFileParser
 */
public class RoverInstructionFileParserTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public RoverInstructionFileParserTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(RoverInstructionFileParserTest.class);
    }

	public void testLegalInstructionParsing() {
		RoverInstructionFileParser parser =
				new RoverInstructionFileParser("core_test.txt");
		String line = parser.get_line();
		assertEquals(line, "5 5");
		assertEquals(parser.tokenize(line), ["5","5"]);
	}
	public void testUnknownFile() {
		boolean caught = false;
		try {
			RoverInstructionFileParser parser =
					new RoverInstructionFileParser("nonexist.txt");
		} catch (IllegalArgumentException thrown) {
			caught = true;
		}
		assertTrue(caught);
	}
	public void testIllegalFileFormat() {
		boolean caught = false;
		try {
			RoverInstructionFileParser parser =
					new RoverInstructionFileParser("illegal_format.txt");
		} catch (IllegalStateException thrown) {
			caught = true;
		}
		assertTrue(caught);
	}
}
