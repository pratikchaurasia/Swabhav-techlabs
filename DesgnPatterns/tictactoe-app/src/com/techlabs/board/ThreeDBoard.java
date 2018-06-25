package com.techlabs.board;

import com.techlabs.exceptions.OutOfBoundsException;

public class ThreeDBoard implements IBoard{
	private Cell[][] cell = new Cell[3][3];

	public ThreeDBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				cell[i][j] = new Cell();
			}
		}
	}

	@Override
	public void setCell(int x, int y, Mark mark) {
		if (x > 2 || y > 2 || x < 0 || y < 0) {
			throw new OutOfBoundsException();
		}
		cell[x][y].setMark(mark);
	}

	
	@Override
	public Mark getCell(int x, int y) {
		if (x > 2 || y > 2 || x < 0 || y < 0) {
			throw new OutOfBoundsException();
		}
		return cell[x][y].getMark();
	}

	
	@Override
	public Cell[][] getAllCell() {
		return cell;
	}

	/* (non-Javadoc)
	 * @see com.techlabs.board.IBoard#isFull()
	 */
	@Override
	public Boolean isFull() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (cell[i][j].getMark() == Mark.Empty)
					return false;
			}
		}
		return true;
	}
	public int getRow(int cellNo) {
		return (cellNo - 1) / 3;
	}

	public int getColumn(int cellNo) {
		return (cellNo - 1) % 3;
	}
	
}
