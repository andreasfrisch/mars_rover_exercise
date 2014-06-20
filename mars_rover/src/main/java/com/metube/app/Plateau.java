package com.metube.app;

/**
 * The Mars plateau, where the wild rover roam
 * This class is overkill for this exercise
 *
 * Extending the exercise with AI or robot vision
 * will make this class more useful.
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
