package com.techlabs.board;

import com.techlabs.exceptions.CellAlreadyMarkedException;

public class Cell {
	private Mark mark=Mark.Empty;
	
	public void setMark(Mark m){
		if(this.mark!=this.mark.Empty){
			throw new CellAlreadyMarkedException();
		}
		this.mark=m;
	}
	public Mark getMark(){
		return mark;
	}
	
	@Override
	public String toString() {
		return this.mark.toString();
}
}
