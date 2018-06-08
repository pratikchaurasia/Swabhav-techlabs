package com.techlabs.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.board.IBoard;
import com.techlabs.board.Mark;
import com.techlabs.board.Player;
import com.techlabs.board.ThreeDBoard;
import com.techlabs.exceptions.OutOfBoundsException;

public class BoardTest {
	IBoard board = new ThreeDBoard();
	Player p = new Player("Pratik", Mark.O);

	@Test(expected = OutOfBoundsException.class)
	public void testSetCell() {
		board.setCell(0, 5, Mark.X);
		// assertEquals(board.getCell(0, 0),Mark.O);
	}

	@Test(expected = OutOfBoundsException.class)
	public void testOutOfBoardException() {
		board.setCell(5, 5, Mark.O);
	}

	@Test
	public void testIsNotFull() {
		board.setCell(0, 0,Mark.X);
		board.setCell(0, 1,Mark.X);
		board.setCell(0, 2,Mark.X);
		board.setCell(1, 0,Mark.X);
		board.setCell(1, 1,Mark.X);
		board.setCell(1, 2,Mark.X);
		board.setCell(2, 0,Mark.X);
		board.setCell(2, 1,Mark.X);
		// board.setCell(2, 2, p);

		assertEquals(board.isFull(), false);
	}

	@Test
	public void testIsFull() {
		board.setCell(0, 0,Mark.X);
		board.setCell(0, 1,Mark.X);
		board.setCell(0, 2,Mark.X);
		board.setCell(1, 0,Mark.X);
		board.setCell(1, 1,Mark.X);
		board.setCell(1, 2,Mark.X);
		board.setCell(2, 0,Mark.X);
		board.setCell(2, 1,Mark.X);
		board.setCell(2, 2,Mark.X);

		assertEquals(board.isFull(), true);
	}
}
