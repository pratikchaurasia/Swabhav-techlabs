package com.techlabs.board;

public class Result3DAnalyzer implements IResultAnalyzer{
	private IBoard board;
	private Cell cell[][];
	
	public Result3DAnalyzer(IBoard board) {
		this.board = board;
		cell = board.getAllCell();
	}

	@Override
	public Result result(){
		if(win()){
			return Result.Win;
		}
		else if(draw()){
			return Result.Draw;
		}
		else{
			return Result.Ongoing;
		}
			
	}
	
	public boolean win(){
		if(checkHorizontal()==true||checkVertical()==true||checkDiagonal()==true){
			return true;
		}
		return false;
	}
	
	@Override
	public boolean checkHorizontal(){
		for(int i=0;i<3;i++){
			if(cell[i][0].getMark()!=Mark.Empty&&cell[i][0].getMark()==cell[i][1].getMark()&&cell[i][1].getMark()==cell[i][2].getMark()){
					return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean checkVertical(){
		for(int i=0;i<3;i++){
			if(cell[0][i].getMark()!=Mark.Empty&&cell[0][i].getMark()==cell[1][i].getMark()&&cell[1][i].getMark()==cell[2][i].getMark()){
					return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean checkDiagonal(){
		if (cell[0][0].getMark() != Mark.Empty
				&& cell[0][0].getMark() == cell[1][1].getMark()
				&& cell[1][1].getMark() == cell[2][2].getMark()) {
			return true;
		} else if (cell[0][2].getMark() != Mark.Empty
				&& cell[0][2].getMark() == cell[1][1].getMark()
				&& cell[1][1].getMark() == cell[2][0].getMark()) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public boolean draw(){
		if(board.isFull()){
			return true;
		}
		return false;
	}

}
