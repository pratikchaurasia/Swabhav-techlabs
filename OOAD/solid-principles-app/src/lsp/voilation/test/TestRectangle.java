package lsp.voilation.test;

import lsp.voilation.Rectangle;
import lsp.voilation.Square;

public class TestRectangle {
	public static void main(String args[]){
		Rectangle rectangle=new Rectangle(10, 20);
		Square square=new Square(10);
		
		shouldNotChangeTheWidthIfHeightChanges(rectangle);
		shouldNotChangeTheWidthIfHeightChanges(square);
	}
	
	public static void shouldNotChangeTheWidthIfHeightChanges(Rectangle rectangle){
		int beforeWidth=rectangle.getWidth();
		rectangle.setWidth(30);
		int afterWidthChanges=rectangle.getWidth();
		
		System.out.println("Before width change "+beforeWidth);
		System.out.println("Before width change "+beforeWidth);
	}
}
