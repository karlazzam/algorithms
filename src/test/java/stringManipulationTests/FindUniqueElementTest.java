package stringManipulationTests;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import stringManipulation.FindUniqueElement;
import stringManipulation.UniqueStringCheck;

public class FindUniqueElementTest {
	
	@Test
	public void testUniqueString() {
				
		FindUniqueElement findUnique = new FindUniqueElement();
		
		int[] oneElement = {1};
		int[] unique4 = {1, 2, 3, 3, 1, 4, 5, 2, 5}; //unique = 4
		int[] unique8 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 9, 10}; //unique = 8
		int[] uniqueNeg8 = { -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -1, -2, -3, -4, -5, -6, -7, -9, -10, 
				1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //unique = 8

		assertEquals(1, findUnique.uniqueElementSolutionOne(oneElement));
		assertEquals(1, findUnique.uniqueElementSolutionTwo(oneElement));
		assertEquals(4, findUnique.uniqueElementSolutionOne(unique4));
		assertEquals(4, findUnique.uniqueElementSolutionTwo(unique4));
		assertEquals(8, findUnique.uniqueElementSolutionOne(unique8));
		assertEquals(8, findUnique.uniqueElementSolutionTwo(unique8));
		assertEquals(-8, findUnique.uniqueElementSolutionOne(uniqueNeg8));
		assertEquals(-8, findUnique.uniqueElementSolutionTwo(uniqueNeg8));

		
		
	}

}
