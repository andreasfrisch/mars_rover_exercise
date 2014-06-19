package com.metube.app;

/**
 * The Mars plateau, where the wild rover roam
 * This class serves little purpose at this time
 */
public class Plateau {
	private int width;
	private int height;

	/*
	 * Constructor
	 */
	Plateau (int w, int h) {
		width = w;
		height = h;
	}

	public int get_width() {
		return width;
	}
	public int get_height() {
		return height;
	}
}
