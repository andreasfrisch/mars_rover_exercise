package com.metube.app;

/**
 * Controlling the world, the rovers, everything
 */
public class Controller {
	private String filepath = "";
	public static void main(String[] args) {
		if (args.length == 1) {
			System.out.println("You requested: "+args[0]);
		} else {
			System.out.println("Usage: Please specify filepath...");
		}
	}
}
