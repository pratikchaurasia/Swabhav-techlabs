package lsp.voilation;

public class Rectangle {
	protected int width;
	protected int height;
	
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
	public int calculateArea(){
		return(width*height);
	}

}
