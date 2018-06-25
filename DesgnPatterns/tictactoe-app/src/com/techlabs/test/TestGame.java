package com.techlabs.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.techlabs.board.IBoard;
import com.techlabs.board.IResultAnalyzer;
import com.techlabs.board.ThreeDBoard;
import com.techlabs.board.Game;
import com.techlabs.board.Mark;
import com.techlabs.board.Player;
import com.techlabs.board.Result;
import com.techlabs.board.Result3DAnalyzer;

public class TestGame {
	static String buffer[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
	static private String playerName1, playerName2;
	static private IBoard b = new ThreeDBoard();
	static private IResultAnalyzer ra = new Result3DAnalyzer(b);
	static private int row, column;
	static private int cellNo = 0;
	//static private Player p1 = new Player(playerName1, Mark.X);
	//static private Player p2 = new Player(playerName2, Mark.O);

	//static private Player p[] = { p1, p2 };
	//static private

	public static void main(String args[]) throws IOException {

		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Enter the name of the player ");
		playerName1 = bufferReader.readLine();

		System.out.println("Enter the name of the player ");
		playerName2 = bufferReader.readLine();

		Player p1 = new Player(playerName1, Mark.X);
		Player p2 = new Player(playerName2, Mark.O);
		Player p[] = { p1, p2 };
		Game game = new Game(b, p, ra);
		
		System.out.println("Enter the cell number from 1 to 9");
		
		for (int k = 0; k < 9; k++) {
			cellNo = Integer.parseInt(bufferReader.readLine());
			Result r = game.play(getRow(cellNo), getColumn(cellNo));
			buffer[cellNo - 1] = b.getCell(getRow(cellNo), getColumn(cellNo))
					.toString();
			display();
			if (r == Result.Win) {
				System.out
						.println(game.getCurrentplayer().toString() + " " + r);
			}
			if (r == Result.Win) {
				break;
			}
			System.out.println(r);
		}
	}

	public static void display() {
		int counter = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(buffer[counter++] + "   ");
			}
			System.out.println();
		}
	}

	public static int getRow(int cellNo) {
		return (cellNo - 1) / 3;
	}

	public static int getColumn(int cellNo) {
		return (cellNo - 1) % 3;
	}
	}
