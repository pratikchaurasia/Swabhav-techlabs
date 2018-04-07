package com.techlabs.observer.frames;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class WelcomeFrame extends JFrame{
	JButton button1 = new JButton("Hello"); 
	JButton button2= new JButton("Exit"); 
    
	
	
	public WelcomeFrame() 
	  {
		add(button1);   
		add(button2);
		this.setSize(400, 400);
		this.setLayout(new GridLayout(1,2));
		this.setVisible(true);
	                       
	    setLayout( new FlowLayout() );     

	    
	    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );  
	    button1.addActionListener(new HelloListner());
	    button2.addActionListener(new GoodbyeListner());
	  }
	}

