package edu.au.rmit.ct;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	private final Calculator calculator = new Calculator();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {

	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	   @Test
	    void addition() { // This should prompt Eclipse to create the method, if not already
	        assertEquals(2, calculator.add(1, 1));
	    }
	   
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
