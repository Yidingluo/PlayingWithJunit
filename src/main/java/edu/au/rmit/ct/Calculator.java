package edu.au.rmit.ct;

interface Calculator {
	
	// no constructors for interfaces
	
	public int addIntegers(int i, int j); 
	public double divideIntegers(int i, int j);
	public double toPercent(double i);
	public double fromPercent(double i);
	public int modulus (int i, int j);
	public int getMemoryStore();  // memory of last integer result of calculation
	public boolean resetMemory();

}
