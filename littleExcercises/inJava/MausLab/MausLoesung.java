package inJava.MausLab;

import java.util.HashMap;
import java.util.Stack;

//import Aufgabe3DSA.Stack;

public class MausLoesung {


	Stack memory = new Stack();
	public int counter = 0;
	Stack a1 = new Stack();

	public char[][] maze =
			{{'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
					{'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
					{'#', ' ', '#', '#', '#', '#', ' ', '#', '#', ' ', '#', '#', ' ', '#', '#', '#', '#', ' ', '#'},
					{'#', ' ', '#', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', '#', ' ', ' ', ' ', '#'},
					{'#', ' ', '#', ' ', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#'},
					{'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
					{'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}};

	public MausLoesung() {
		//maze[1][1] = 'S';
		maze[3][11] = 'X';
	}

	// Set the start location S in solve(x,y)
	public void solve(int x, int y) {
		if (step(x, y)) {
			maze[x][y] = 'S';
		}
	}

	// Method of Backtracking
	public boolean step(int x, int y) {

		counter++;


		/** Accept case - we found the exit **/
		if (maze[x][y] == 'X') {
			return true;
		}

		/** Reject case - we hit a wall or our path **/
		if (maze[x][y] == '#' || maze[x][y] == '*') {
			return false;
		}

		/** Backtracking Step **/

		// Mark the location to our path
		String s = "Position x,y: " + x + "," + y;
		a1.push(s);
		maze[x][y] = '*';

		boolean result;

		// Go right
		result = step(x, y + 1);
		if (result) {

			return true;
		}

		// Go up
		result = step(x - 1, y);
		if (result) {

			return true;
		}

		// Go left
		result = step(x, y - 1);
		if (result) {

			return true;
		}

		// Go down
		result = step(x + 1, y);
		if (result) {

			return true;
		}


		/** Deadend - this location can't be part of the solution **/

		// remove *
		maze[x][y] = ' ';
		a1.pop();
		// Go back
		return false;
	}


	public String toString() {
		String output = "";
		for (int x = 0; x < maze.length; x++) {
			for (int y = 0; y < 19; y++) {
				output += maze[x][y] + " ";
			}
			output += "\n";
		}
		return output;
	}
}

	
	
	
	
	
