package com.techlabs.addition;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest {
	
	Addition add=new Addition();
	@Test
	public void testAdd() {
		 assertEquals(-2,Addition.add(-1,-1));
	}

}
