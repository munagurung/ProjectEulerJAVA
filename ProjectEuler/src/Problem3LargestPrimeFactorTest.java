import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class Problem3LargestPrimeFactorTest {

	/**
	 * Test to check if an object from a class can be created
	 */
	@Test
	public void createObject() {
		Problem3LargestPrimeFactor obj = new Problem3LargestPrimeFactor();
	}
	
	/**
	 * Test that finds the first 15 prime number
	 */
	@Test
	public void findPrimeNumber() {
		Problem3LargestPrimeFactor obj = new Problem3LargestPrimeFactor();
		ArrayList<Long> actual = obj.findPrimeNumbers(15);
		ArrayList<Long> expected = new ArrayList<>();
		expected.add(2L);
		expected.add(3L);
		expected.add(5L);
		expected.add(7L);
		expected.add(11L);
		expected.add(13L);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test that finds the highest prime factor of 13195
	 */
	@Test
	public void findPrimeFactor() {
		Problem3LargestPrimeFactor obj = new Problem3LargestPrimeFactor();
		ArrayList<Long> a = obj.findPrimeNumbers(50);
		ArrayList<Long> actual = obj.findPrimeFactors(13195);
		ArrayList<Long> expected = new ArrayList<>();
		expected.add(5L);
		expected.add(7L);
		expected.add(13L);
		expected.add(29L);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test that finds the highest prime factor of 13195
	 */
	@Test
	public void findHighestPrimeFactor() {
		Problem3LargestPrimeFactor obj = new Problem3LargestPrimeFactor();
		ArrayList<Long> a = obj.findPrimeNumbers(50);
		ArrayList<Long> b = obj.findPrimeFactors(13195);
		long actual = obj.findHighestPrimeFactor(b);
		long expected = 29;
		assertEquals(expected, actual);
	}
	
	/**
	 * Test that finds the highest prime factor of 600851475143
	 */
	@Test
	public void findHighestPrimeFactorSolution() {
		Problem3LargestPrimeFactor obj = new Problem3LargestPrimeFactor();
		ArrayList<Long> a = obj.findPrimeNumbers(1000000);
		ArrayList<Long> b = obj.findPrimeFactors(600851475143l);
		long actual = obj.findHighestPrimeFactor(b);
		long expected = 6857;
		assertEquals(expected, actual);
	}
	
	/**
	 * Test that finds the highest prime factor of 90
	 */
	@Test
	public void findHighestPrimeFactor90() {
		Problem3LargestPrimeFactor obj = new Problem3LargestPrimeFactor();
		ArrayList<Long> a = obj.findPrimeNumbers(100);
		ArrayList<Long> b = obj.findPrimeFactors(90);
		long actual = obj.findHighestPrimeFactor(b);
		long expected = 5;
		assertEquals(expected, actual);
	}
}
