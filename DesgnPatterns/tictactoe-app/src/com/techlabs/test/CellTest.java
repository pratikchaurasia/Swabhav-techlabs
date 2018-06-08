package com.techlabs.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.board.Cell;
import com.techlabs.board.Mark;
import com.techlabs.exceptions.CellAlreadyMarkedException;

public class CellTest {
	Cell cell=new Cell();
	@Test(expected=CellAlreadyMarkedException.class)
	public void testSetCell() {
		cell.setMark(Mark.X);
		cell.setMark(Mark.X);
		
	}
	@Test
	public void testCellCreatedWithNoMark() {
		assertEquals(cell.getMark(), Mark.Empty);
	}

	@Test
	public void testSetMark() {

		cell.setMark(Mark.X);

		assertEquals(cell.getMark(), Mark.X);
}

}
