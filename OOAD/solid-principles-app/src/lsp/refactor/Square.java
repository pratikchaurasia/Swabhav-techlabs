package lsp.refactor;


public class Square implements IPolygon{
	private int side;
	
	public Square(int side){
		setSide(side);
	}
	public void  setSide(int side){
		this.side=side;
	}
	@Override
	public int calculateArea() {
		
		return side*side;
	}
}
