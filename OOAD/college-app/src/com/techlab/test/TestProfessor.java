package com.techlab.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlab.proffesor.Professor;

public class TestProfessor {

	@Test
	public void testCalculteSalary() {
		Professor professor = new Professor("pratik", "vasai", "08/11/1996",
				15000.0);
		double calculatedSalary = professor.calculateSalary();
		double actualSalary = 15000.0 - (15000.0 * 0.2);

		assertEquals(calculatedSalary, actualSalary, 0);
	}
}
