package stringManipulationTests;

import static org.junit.Assert.*;
import org.junit.Test;
import stringManipulation.FindUniqueElement;

public class FindUniqueElementTest {

	@Test
	public void testUniqueString() {

		FindUniqueElement findUnique = new FindUniqueElement();

		int[] oneElement = { 1 }; // unique = 1
		int[] unique4 = { 1, 2, 3, 3, 1, 4, 5, 2, 5 }; // unique = 4
		int[] unique8 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 9, 10 }; // unique
																						// =
																						// 8
		int[] uniqueNeg8 = { -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -1, -2, -3, -4, -5, -6, -7, -9, -10, 1, 2, 3, 4,
				5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // unique =
																	// -8
		int[] unique1 = { 2, 2, 2, 2, 2, 2, 2, 1, 3, 3, 3, 4, 4, 4, 5, 5 }; // unique
																			// =
																			// 1

		assertEquals(1, findUnique.uniqueElementSolutionOne(oneElement));
		assertEquals(1, findUnique.uniqueElementSolutionTwo(oneElement));
		assertEquals(1, findUnique.uniqueElementSolutionThree(oneElement));
		assertEquals(1, findUnique.uniqueElementSolutionThree(unique1));

		assertEquals(4, findUnique.uniqueElementSolutionOne(unique4));
		assertEquals(4, findUnique.uniqueElementSolutionTwo(unique4));
		assertEquals(4, findUnique.uniqueElementSolutionThree(unique4));

		assertEquals(8, findUnique.uniqueElementSolutionOne(unique8));
		assertEquals(8, findUnique.uniqueElementSolutionTwo(unique8));
		assertEquals(8, findUnique.uniqueElementSolutionThree(unique8));

		assertEquals(-8, findUnique.uniqueElementSolutionOne(uniqueNeg8));
		assertEquals(-8, findUnique.uniqueElementSolutionTwo(uniqueNeg8));
		assertEquals(-8, findUnique.uniqueElementSolutionThree(uniqueNeg8));

	}

}
