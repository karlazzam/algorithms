package stringManipulationTests;

import static org.junit.Assert.*;

import org.junit.Test;
import stringManipulation.UniqueStringCheck;

public class UniqueStringTest {
	
	@Test
	public void testUniqueString() {
		
		UniqueStringCheck uniqueCheck = new UniqueStringCheck();
		
		
		assertTrue(uniqueCheck.isUnique("abc"));
		assertTrue(uniqueCheck.isUnique("abcdefghijlport"));
		assertFalse(uniqueCheck.isUnique("abcdeafg"));
		assertTrue(uniqueCheck.isUnique("a"));
		assertFalse(uniqueCheck.isUnique(""));
	}

}
