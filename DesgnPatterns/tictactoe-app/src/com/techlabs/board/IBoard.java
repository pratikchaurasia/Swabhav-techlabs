package com.techlabs.board;

public interface IBoard {

	public abstract void setCell(int x, int y, Mark mark);

	public abstract Mark getCell(int x, int y);

	public abstract Cell[][] getAllCell();

	public abstract Boolean isFull();

	public abstract int getRow(int cellNo);

	public abstract int getColumn(int cellNo);

	

}