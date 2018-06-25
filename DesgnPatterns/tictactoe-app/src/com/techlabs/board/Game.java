package com.techlabs.board;


public class Game {
	public IBoard board;
	public Player[] player = new Player[2];
	private Player currentPlayer;
	private IResultAnalyzer analyser;
	
	
	public Game(IBoard board, Player[] player, IResultAnalyzer analyzer){
		this.board=board;
		this.player=player;
		this.analyser=analyzer;
		this.currentPlayer=player[0];
	}
	public Result play(int x,int y){
		board.setCell(x, y,currentPlayer.getMark() );
		Result r=analyser.result();
		if (r == Result.Win) {
			return Result.Win;
		} else if (r == Result.Draw) {
			return Result.Draw;
		} else {
			changePlayer();
			return Result.Ongoing;
		}
		
	}
	private void changePlayer() {
		if ((currentPlayer).equals(player[0])) {
			currentPlayer = player[1];
		} else {
			currentPlayer = player[0];
		}
}
	public Player getCurrentplayer() {
		return currentPlayer;
	}

}
