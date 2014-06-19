package com.metube.app;

/**
 * Rover
 */
public class Rover {
	private String heading;
	private int x_coordinate;
	private int y_coordinate;

	Rover (int x, int y, String h) {
		heading = h;
		x_coordinate = x;
		y_coordinate = y;
	}

	public String get_heading() {
		return heading;
	}
	public int get_x_coordinate() {
		return x_coordinate;
	}
	public int get_y_coordinate() {
		return y_coordinate;
	}
}
