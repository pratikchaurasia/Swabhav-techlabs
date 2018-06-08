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
	/* (non-Javadoc)
	 * @see com.techlabs.board.IBoard#setCell(int, int, com.techlabs.board.Mark)
	 */
	@Override
	public void setCell(int x, int y, Mark mark) {
		if (x > 2 || y > 2 || x < 0 || y < 0) {
			throw new OutOfBoundsException();
		}
		cell[x][y].setMark(mark);
	}

	/* (non-Javadoc)
	 * @see com.techlabs.board.IBoard#getCell(int, int)
	 */
	@Override
	public Mark getCell(int x, int y) {
		if (x > 2 || y > 2 || x < 0 || y < 0) {
			throw new OutOfBoundsException();
		}
		return cell[x][y].getMark();
	}

	/* (non-Javadoc)
	 * @see com.techlabs.board.IBoard#getAllCell()
	 */
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
	
}
