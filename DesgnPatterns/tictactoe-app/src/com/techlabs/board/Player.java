package com.techlabs.board;

public class Player {
	private Mark mark;
	private String name;
	
	public Player(String name,Mark m){
		this.name=name;
		this.mark=m;
	}

	public Mark getMark() {
		return this.mark;
	}
	
	@Override
	public String toString() {
		return this.name;
}

}
