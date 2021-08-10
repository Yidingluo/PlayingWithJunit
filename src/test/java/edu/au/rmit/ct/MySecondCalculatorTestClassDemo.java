package edu.au.rmit.ct;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;

@Nested
class MySecondCalculatorTestClassDemo {
	

	
	@Test 
	@DisplayName("1. Example of AssertTrue @DisplayName / AssertFalse and Reset Memory")
	void checkBooleanReturnResetMemory() throws Exception {
		fail("Not implemented yet!");
	}
	
	@Test
	@DisplayName("2. Example of Errorenous Exception thrown by MyCalculator Object")
	void errorExceptionThrownNotHandled() throws Exception {
		fail("Not implemented yet!");
	}
	
	

	@Test
	@DisplayName("3. Example of Catching Exception thrown by MyCalculator Object")
	void ExceptionThrown() throws Exception{
		fail("Not implemented yet!");
	}
	
	@Test
	@DisplayName("4. Example of testing the default constructor with no params")
	void checkDefaultConstructor() {
		fail("Not implemented yet!");
		
	}
	
	@Test
	@DisplayName("5. Example of testing the constructor")
	void checkConstructor() throws Exception {
		fail("Not implemented yet!");
	}
 
	@Nested
	@DisplayName("6. Example of Nested Test cases")
	class aSetOfNestedTestCases{ // note how this is in a class.
		@Test
		@DisplayName("... showing use of a nested Junit fail method")
		void testNested1() {
			fail("not yet implemented");
		}	
		@Test
		@DisplayName("... showing second use of a nested Junit fail method")
		void testNested2() {
			fail("not yet implemented");
		}	
	}

    @Test
    @DisplayName("7. Using assertTimeout function to test duration of Thread.sleep(int milliseconds)")
     void testWithAssertTimeout() {
		fail("Not implemented yet!");
    }
    
    //@Disabled
    @Test
    @RepeatedTest(5)
    @DisplayName("8. Five repetitions of Using assertTimeout function to test duration of Thread.sleep(int milliseconds)")
     void testRepeatedlyWithAssertTimeout() {
		fail("Not implemented yet!");
    }
	
}
