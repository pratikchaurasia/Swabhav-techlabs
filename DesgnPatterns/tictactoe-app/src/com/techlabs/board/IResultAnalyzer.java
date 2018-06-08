package com.techlabs.board;

public interface IResultAnalyzer {

	public abstract Result result();

	public abstract boolean win();

	public abstract boolean checkHorizontal();

	public abstract boolean checkVertical();

	public abstract boolean checkDiagonal();

	public abstract boolean draw();

}