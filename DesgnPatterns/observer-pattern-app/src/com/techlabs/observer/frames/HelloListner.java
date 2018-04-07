package com.techlabs.observer.frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloListner implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Hello Listner listening to source");
		
	}
	
}
