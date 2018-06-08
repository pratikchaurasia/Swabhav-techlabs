package com.techlabs.board;

import com.techlabs.exceptions.OutOfBoundsException;

public class FourDboard implements IBoard{
	private Cell[][] cell = new Cell[4][4];

	public FourDboard() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				cell[i][j] = new Cell();
			}
		}
	}
	@Override
	public void setCell(int x, int y, Mark mark) {
		if (x > 3 || y > 3 || x < 0 || y < 0) {
			throw new OutOfBoundsException();
		}
		cell[x][y].setMark(mark);
	}
	@Override
	public Mark getCell(int x, int y) {
		if (x > 3 || y > 3 || x < 0 || y < 0) {
			throw new OutOfBoundsException();
		}
		return cell[x][y].getMark();
	}
	@Override
	public Cell[][] getAllCell() {
		return cell;
	}
	@Override
	public Boolean isFull() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (cell[i][j].getMark() == Mark.Empty)
					return false;
			}
		}
		return true;
	}

}
