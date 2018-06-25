package com.techlabs.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.board.Mark;
import com.techlabs.board.Player;

public class PlayerTest {

	@Test
	public void test() {
		Player p1=new Player("pratik",Mark.X);
		assertEquals("pratik", p1.toString());
	}

}
