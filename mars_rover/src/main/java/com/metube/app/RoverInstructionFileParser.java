package com.metube.app;

//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
import java.io.*;
import java.util.Arrays;

/**
 * Class for parsing Rover instruction files
 * an instruction file has the format:
 * W H				<- width and height of plateau 
 * X Y H			<- coordinates and heading of rover 1
 * [LRM]*			<- instructions for rover 1
 * X Y H			<- coordinates and heading of rover 2
 * [LRM]*			<- instructions for rover 2
 */
public class RoverInstructionFileParser {
	private BufferedReader reader;

	/*
	 * Constructor
	 */
	RoverInstructionFileParser(String filepath) {
		try {
			reader = new BufferedReader(new FileReader(filepath));
		} catch (IOException e) {
			throw new IllegalArgumentException("File not found");	
		}
	}

	/*
	 * Public methods
	 */
	public String get_line() {
		try {
			String line = reader.readLine();
			if (line == null) {
				throw new IllegalStateException("Illegal file format");
			} else {
				return line;
			}
		} catch (IOException e) {
			throw new IllegalStateException("Illegal file format");
		}
	}
	public String[] tokenize(String line) {
		return line.split(" ");
	}
}
