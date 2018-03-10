package lsp.voilation;

public class Square extends Rectangle{
	public Square(int side){
		super(side,side);
	}
	@Override
	public void  setWidth(int w){
		this.width=height=w;
	}
	
	@Override
	public void setHeight(int h){
		this.height=width=h;
	}
}
