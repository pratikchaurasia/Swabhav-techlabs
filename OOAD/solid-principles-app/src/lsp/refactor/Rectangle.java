package lsp.refactor;

public class Rectangle implements IPolygon{
	private int width;
	private int height;
	
	public Rectangle(int width, int height){
		setWidth(width);
		
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
	@Override
	public int calculateArea(){
		return(width*height);
	}

}
