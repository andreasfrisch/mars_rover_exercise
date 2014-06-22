package com.metube.app;

/**
 * Controlling the world, the rovers, everything
 */
public class Controller {
	private String filepath = "";
	private RoverInstructionFileParser parser;
	private Plateau plateau;
	private Rover rover1;
	private Rover rover2;

	public static void main(String[] args) {
		Controller controller = new Controller();
		controller.start(args);
	}	
	public void start(String[] args) {
		if (args.length == 0) {
			filepath = "core_test.txt";
		} else if (args.length == 1) {
			filepath = args[0];
		} else {
			System.out.println("Usage: Please specify filepath...");
		}

		parser = new RoverInstructionFileParser(filepath);
		String[] plateau_dimensions = parser.tokenize(parser.get_line());
		plateau = new Plateau(
				Integer.parseInt(plateau_dimensions[0]),
				Integer.parseInt(plateau_dimensions[1])
		);
		String[] rover1_init = parser.tokenize(parser.get_line());
		rover1 = new Rover(
				Integer.parseInt(rover1_init[0]),
				Integer.parseInt(rover1_init[1]),
				rover1_init[2]
		);
		//move rover 1
		String[] rover1_commands = parser.tokenize_commands(parser.get_line());
		//TODO: use enhanced for loop when upgrading java
		for (int i=0; i<rover1_commands.length; i=i+1) {
			rover1.execute_order(rover1_commands[i]);
		}

		String[] rover2_init = parser.tokenize(parser.get_line());
		rover2 = new Rover(
				Integer.parseInt(rover2_init[0]),
				Integer.parseInt(rover2_init[1]),
				rover2_init[2]
		);
		//move rover 2
		String[] rover2_commands = parser.tokenize_commands(parser.get_line());
		//TODO: use enhanced for loop when upgrading java
		for (int i=0; i<rover2_commands.length; i=i+1) {
			rover2.execute_order(rover2_commands[i]);
		}

		//finally
		//output new rover coordinates and heading
		//TODO: use String.format when upgrading java version
		String position1 = "Rover 1: "+
				rover1.get_x_coordinate()+" "+
				rover1.get_y_coordinate()+" "+
				rover1.get_heading();
		System.out.println(position1);
		String position2 = "Rover 2: "+
				rover2.get_x_coordinate()+" "+
				rover2.get_y_coordinate()+" "+
				rover2.get_heading();
		System.out.println(position2);
	}
}
