package edu.au.rmit.ct;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyCalculatorTestClassDemo {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	@Test
	void testAddNumbersSimple() {
		MyCalculator mc = new MyCalculator(41, "Hp-41CV Calculator");
		assertEquals(12, mc.addIntegers(5,7) );

	}

	@Test
	void testAddIntegersBiggerNumbers() {
		MyCalculator mc = new MyCalculator(41, "Hp-41CV Calculator");
		assertEquals(888888, mc.addIntegers(555555,333333) );
	}

	@Test
	void testSameNotSameCalculator() {
		MyCalculator mc = new MyCalculator(41, "Hp-41CV Calculator");
		MyCalculator ic = new MyCalculator(100, "Ivan Basic Calculator");
		MyCalculator dc = mc;
		assertSame(dc,mc,"Wait a minute, these are the same calculators");
		assertNotSame(dc, ic, "Am I getting two for the price of one");
		assertEquals(417708819, mc.addIntegers(1354651,416354168) );
	}
	
	@Test
	void testAddIntegersEvenBiggerNumbers() {
		MyCalculator mc = new MyCalculator(41, "Hp-41CV Calculator");
		assertEquals(417708819, mc.addIntegers(1354651,416354168) );
	}
	
	@Test
	void testAddIntegersEvenBiggerNumbersAndNegativeInteger() {
		MyCalculator mc = new MyCalculator(41, "Hp-41CV Calculator");
		assertEquals(-414999517, mc.addIntegers(1354651,-416354168) );
	}
}
