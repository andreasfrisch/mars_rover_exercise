package com.metube.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.Arrays;

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
		//TODO: perform proper array-equality test
		String tokenizedLine = Arrays.toString(parser.tokenize(line));
		assertEquals(tokenizedLine, "[5, 5]");
	}
	public void testCommandTokenizing() {
		RoverInstructionFileParser parser =
				new RoverInstructionFileParser("command_string_only.txt");
		String line = parser.get_line();
		assertEquals(line, "MRRML");
		//TODO: perform proper array-equality test
		String tokenizedLine = Arrays.toString(
				parser.tokenize_commands(line)
		);
		System.out.println(tokenizedLine);
		//assertEquals(tokenizedLine, "[5, 5]");
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
			String line;
			line = parser.get_line();
			line = parser.get_line();
			line = parser.get_line();
			line = parser.get_line(); //this line is illegally empty
		} catch (IllegalStateException thrown) {
			caught = true;
		}
		assertTrue(caught);
	}
}
