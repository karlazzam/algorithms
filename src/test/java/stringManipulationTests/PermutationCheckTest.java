package stringManipulationTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import stringManipulation.PermutationCheck;

public class PermutationCheckTest {

	@Test
	public void testUniqueString() {
		
		PermutationCheck permutationCheck = new PermutationCheck();
		
		/**
		 * Check for only anagram type permutations
		 */
		assertEquals(true,permutationCheck.isPermutation("abc", "abc"));
		assertEquals(true,permutationCheck.isPermutation("bca", "abc"));
		assertEquals(false,permutationCheck.isPermutation("abcd", "abc"));
		assertEquals(true,permutationCheck.isPermutation("bcaefgty", "gaebyfct"));
		assertEquals(true,permutationCheck.isPermutation("bcaefgtyabcdefghijklmno", "ikagfaengdlbhcymeofctbj"));
		assertEquals(true,permutationCheck.isPermutation("ab12c", "1abc2"));
		assertEquals(true,permutationCheck.isPermutation("1234567", "7654321"));
		assertEquals(false,permutationCheck.isPermutation("aabbccddeeff", "aabbccddeeffa"));
		
		/**
		 * Check for all possible permutations of s1 into s2
		 */
		
		assertEquals(false,permutationCheck.isPermutation2("abcaaaa", "fabca"));
		assertEquals(true,permutationCheck.isPermutation2("abca", "fabca"));
		assertEquals(true,permutationCheck.isPermutation2("ab", "eidbaooo"));
		assertEquals(true,permutationCheck.isPermutation2("adc", "dcda"));
		assertEquals(false,permutationCheck.isPermutation2("hello", "ooolleoooleh"));
		assertEquals(true,permutationCheck.isPermutation2("pqzhi", "ghrqpihzybre"));


	}
}
