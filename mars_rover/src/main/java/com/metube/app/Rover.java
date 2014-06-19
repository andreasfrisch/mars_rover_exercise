package com.metube.app;

/**
 * Rover
 */
public class Rover {
	private int heading;
	private int x_coordinate;
	private int y_coordinate;

	//Enum wouldn't work, made something similar
	private class Heading {
		private final static int North = 0;
		private final static int East = 1;
		private final static int South = 2;
		private final static int West = 3;
	}

	/*
	 * Constructor
	 */
	Rover (int x, int y, String h) {
		if (h.equals("N")) {
			heading = Heading.North;
		} else
		if (h.equals("E")) {
			heading = Heading.East;
		} else
		if (h.equals("S")) {
			heading = Heading.South;
		} else
		if (h.equals("W")) {
			heading = Heading.West;
		}
		x_coordinate = x;
		y_coordinate = y;
	}

	/*
	 * Public methods
	 */
	public String get_heading() {
		switch(heading) {
			case Heading.North: return "N";
			case Heading.East: return "E";
			case Heading.South: return "S";
			case Heading.West: return "W";
			default: throw new IllegalArgumentException(
					"Illegal initial heading supplied"
			);
		}
	}
	public int get_x_coordinate() {
		return x_coordinate;
	}
	public int get_y_coordinate() {
		return y_coordinate;
	}
	public void execute_order(String order) {
		if (order.equals("L")) {
			rotate_rover_left();
		} else
		if (order.equals("R")) {
			rotate_rover_right();
		}
		if (order.equals("M")) {
			move_rover();
		}
	}
	/*
	 * Private methods
	 */
	private void rotate_rover_right() {
		heading = (heading+1) % 4; //4 directions
	}
	private void rotate_rover_left() {
		heading = (heading-1) % 4; //4 directions
		if (heading < 0) { //fix sign of Java modulus
			heading += 4;
		}
	}
	private void move_rover() {
		switch(heading) {
			case Heading.North:
				y_coordinate += 1; break;
			case Heading.South:
				y_coordinate -= 1; break;
			case Heading.East:
				x_coordinate += 1; break;
			case Heading.West:
				x_coordinate -= 1; break;
		}
	}
}
