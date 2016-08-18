import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class Problem2Test {
	
//	@Test
//	public void canCreateProblem2() {
//		Problem2 obj = new Problem2();
//	}
	
	@Test
	public void createFibonacciSequence()
	{
		Problem2 obj = new Problem2();
		ArrayList<Integer> result = obj.fibonacciSequence(10);
		ArrayList<Integer> exp = new ArrayList<>();
		//1, 2, 3, 5, 8, 13, 21, 34, 55, 89
		exp.add(1);
		exp.add(2);
		exp.add(3);
		exp.add(5);
		exp.add(8);
		exp.add(13);
		exp.add(21);
		exp.add(34);
		exp.add(55);
		exp.add(89);
		assertEquals(exp, result);
	}
	
	@Test
	public void findEvenSequence()
	{
		Problem2 obj = new Problem2();
		ArrayList<Integer> fseq = obj.fibonacciSequence(10);
		ArrayList<Integer> actual = obj.evenSequence();
		ArrayList<Integer> expected = new ArrayList<>();
		//1, 2, 3, 5, 8, 13, 21, 34, 55, 89
		expected.add(2);
		expected.add(8);
		expected.add(34);
		assertEquals(expected, actual);
	}
	
	@Test
	public void findSum() {
		Problem2 obj = new Problem2();
		ArrayList<Integer> fseq = obj.fibonacciSequence(10);
		ArrayList<Integer> even = obj.evenSequence();
		int actual = obj.sum();
		int expected = 44;
		assertEquals(expected, actual);
	}
	
	@Test
	public void findSum4mil()
	{
		Problem2 obj = new Problem2();
		ArrayList<Integer> fseq = obj.fibonacciSequenceByValue(4000000);
		ArrayList<Integer> even = obj.evenSequence();
		int actual = obj.sum();
		ArrayList<Integer> expected = new ArrayList<>();
		//1, 2, 3, 5, 8, 13, 21, 34, 55, 89
		expected.add(2);
		expected.add(8);
		expected.add(34);
		assertEquals(4613732, actual);
	}
}
