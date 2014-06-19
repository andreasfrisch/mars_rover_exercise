package com.metube.app;

/**
 * Rover
 */
public class Rover {
	private int heading;
	private int x_coordinate;
	private int y_coordinate;

	/*
	 * Constructor
	 */
	Rover (int x, int y, String h) {
		if (h.equals("N")) {
			heading = 0;
		} else
		if (h.equals("E")) {
			heading = 1;
		} else
		if (h.equals("S")) {
			heading = 2;
		} else
		if (h.equals("W")) {
			heading = 3;
		}
		x_coordinate = x;
		y_coordinate = y;
	}

	/*
	 * Public methods
	 */
	public String get_heading() {
		switch(heading) {
			case 0: return "N";
			case 1: return "E";
			case 2: return "S";
			case 3: return "W";
			default: return "Q"; //error
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
			switch (heading) {
				case 0: heading = 3; break;
				case 3: heading = 2; break;
				case 2: heading = 1; break;
				case 1: heading = 0; break;
				default: break;
			}
		} else
		if (order.equals("R")) {
			switch (heading) {
				case 0: heading = 1; break;
				case 1: heading = 2; break;
				case 2: heading = 3; break;
				case 3: heading = 0; break;
				default: break;
			}
		}
	}
}
