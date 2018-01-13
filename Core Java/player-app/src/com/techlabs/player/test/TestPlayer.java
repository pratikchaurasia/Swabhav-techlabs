package com.techlabs.player.test;

import com.techlabs.player.Player;

public class TestPlayer {
	public static void main(String []args) {
		caseStudyOne();
		
		Player player=new Player(101,"Sachin",45);
		Player player1=new Player(101,"Sachin",45);
		System.out.println(player==player1);
		System.out.println(player.equals(player1));
		
		
		
		
		
	}

	private static void caseStudyOne() {
		Player player=new Player(101,"Sachin",45);
		Player player1=new Player(101,"Virat");
		System.out.println("Player id : "+player.getId());
		System.out.println("Player name is : "+player1.getName());
		player.setAge(40);
		
		Player elder=player.whoIsElder(player1);
		System.out.println("Elder player is : "+elder.getName());
		

		
		
		System.out.println(player);
		System.out.println(player.toString());
	}
	
}
