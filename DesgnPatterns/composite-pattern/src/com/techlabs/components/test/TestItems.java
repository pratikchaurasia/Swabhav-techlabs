package com.techlabs.components.test;



import com.techlabs.components.File;
import com.techlabs.components.Folder;

public class TestItems {
	public static void  main(String args[]) {
		Folder root=new Folder("Root Folder");
		root.addItems(new File("Avengers.mp4",400));
		
		Folder hindiMovies=new Folder("Hindi Movies");
		
		hindiMovies.addItems(new File("abc.avi",500));
		hindiMovies.addItems(new File("xyz.avi",500));
		hindiMovies.addItems(new File("dhoom.avi",500));
		
		root.addItems(hindiMovies);
		root.showContent(0);
	}
}
