import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class Problem1Test {

	@Test
	public void canCreateObject() {
		Problem1 obj = new Problem1();
	}
	
	@Test
	public void findMultiplesof3() {
		Problem1 obj = new Problem1();
		ArrayList<Integer> result = obj.findMultiplesof3(10);
		ArrayList<Integer> exp = new ArrayList<>();
		exp.add(3);
		exp.add(6);
		exp.add(9);
		assertEquals(exp, result);
	}
	
	@Test
	public void findMultiplesof3or5() {
		Problem1 obj = new Problem1();
		ArrayList<Integer> result = obj.findMultiplesof3or5(10);
		ArrayList<Integer> exp = new ArrayList<>();
//		exp.add(0);
		exp.add(3);
		exp.add(5);
		exp.add(6);
		exp.add(9);
		assertEquals(exp, result);
	}
	
	@Test
	public void sum10() {
		Problem1 obj = new Problem1();
		obj.findMultiplesof3or5(10);
		int result = obj.sumOfMultiples(obj.multiples);
		int exp = 23;
		assertEquals(exp, result);
	}
	
	@Test
	public void sum1000() {
		Problem1 obj = new Problem1();
		obj.findMultiplesof3or5(1000);
		int result = obj.sumOfMultiples(obj.multiples);
		int exp = 233168;
		assertEquals(exp, result);
	}

}
