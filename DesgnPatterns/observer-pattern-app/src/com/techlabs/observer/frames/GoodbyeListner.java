package com.techlabs.observer.frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GoodbyeListner implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("GoodBye Listner listening to source");
		
	}
	
}