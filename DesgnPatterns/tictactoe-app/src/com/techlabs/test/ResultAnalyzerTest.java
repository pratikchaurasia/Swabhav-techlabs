package com.techlabs.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.board.IBoard;
import com.techlabs.board.IResultAnalyzer;
import com.techlabs.board.ThreeDBoard;
import com.techlabs.board.Cell;
import com.techlabs.board.Mark;
import com.techlabs.board.Player;
import com.techlabs.board.Result3DAnalyzer;

public class ResultAnalyzerTest {
	private IBoard board = new ThreeDBoard();
	private Cell cell = new Cell();
	IResultAnalyzer analyzer = new Result3DAnalyzer(board);
	Player p = new Player("Pratik", Mark.O);
	Player p1 = new Player("Pratik", Mark.X);

	@Test
	public void testCheckHorizontal() {
		board.setCell(0, 0, Mark.X);
		board.setCell(0, 1, Mark.X);
		board.setCell(0, 2, Mark.X);
		assertTrue(analyzer.checkHorizontal());
	}

	@Test
	public void testCheckVertical() {
		board.setCell(0, 1, Mark.X);
		board.setCell(1, 1, Mark.X);
		board.setCell(2, 1, Mark.X);
		assertTrue(analyzer.checkVertical());
	}

	@Test
	public void testCheckDiagonal() {
		board.setCell(0, 0, Mark.X);
		board.setCell(1, 1, Mark.X);
		board.setCell(2, 2, Mark.X);
		assertTrue(analyzer.checkDiagonal());
	}
	@Test
	public void testCheckWin() {
		board.setCell(0, 0, Mark.X);
		board.setCell(1, 1, Mark.X);
		board.setCell(2, 2, Mark.X);
		assertEquals(analyzer.win(), true);
	}
	@Test
	public void testCheckDraw() {
		board.setCell(0, 0, Mark.X);
		board.setCell(1, 1, Mark.O);
		board.setCell(1, 0, Mark.X);
		board.setCell(2, 0, Mark.O);
		board.setCell(0, 2, Mark.X);
		board.setCell(0, 1, Mark.O);
		board.setCell(2, 1, Mark.X);
		board.setCell(2, 2, Mark.O);
		board.setCell(1, 2, Mark.X);
		assertEquals(analyzer.draw(), true);
	}
}
