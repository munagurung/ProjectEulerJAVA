import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * @author Muna Gurung
 * <p>If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5,
 *  6 and 9. The sum of these multiples is 23.
 *  Find the sum of all the multiples of 3 or 5 below 1000</p>
 *  
 *  <p>Analysis: Natural numbers are positive integers such as 0, 1, 2, etc.
 *  Multiples of a number is the multiplication of that number with an integer.
 *  Sum is done by:
 *  Suppose s =0;
 *  s = s + 3 = 3
 *  s = s + 5 = 3 + 5 = 8;
 *  s = 23.<p>
 */
public class Problem1 {

	/**
	 * This is the default empty constructor of the class
	 * @param empty
	 */
	public Problem1()	{	}

	/** 
	 * Arraylist integer that holds the values of the multiples of 3 and 5
	 */
	ArrayList<Integer> multiples= new ArrayList<>();

	/**
	 * Main method to run the program
	 * @param args
	 */
	public static void main(String[] args) {
		Problem1 obj = new Problem1();
		obj.findMultiplesof3or5(1000);
		obj.sort();
		int result = obj.sumOfMultiples(obj.multiples);
	}

	/**
	 * This method sorts the multiples that are stored in the multiples array list
	 */
	public void sort()
	{
		Collections.sort(multiples);
	}
	
	/**
	 * This method finds the multiples of 3 below limit number,stores in the arraylist and returns it
	 * @param limit
	 * @return multiples
	 */
	public ArrayList<Integer> findMultiplesof3(int limit)
	{
		int multiple = 0; // the product of two integers
		int i = 1; // the second number to multiply
		boolean chk = true;
		while(chk)
		{
			multiple = 3 * i;
			if (multiple > limit)
				chk = false; 
			else
				multiples.add(multiple);
			i++;
		}
		return multiples;
	}

	/**
	 * This method finds the multiples of 3 or 5 below limit number, stores them in arraylist and returns it
	 * @param limit
	 * @return multiples
	 */
	public ArrayList<Integer> findMultiplesof3or5(int limit)
	{
		for (int i=1; i< limit;i++)
		{
			if(i%3 == 0 || i%5 == 0)
				multiples.add(i);
		}
		return multiples;
	}

	/**
	 * This method calculates the sum of multiples from multiples arraylist
	 * @param number
	 * @return sum
	 */
	public int sumOfMultiples(ArrayList<Integer> number)
	{
		int arraySize= multiples.size();
		int sum = 0;
		int i=0;
		for(i=0; i< arraySize; i++)
		{
			sum += multiples.get(i);
		}
		return sum;
	}
}
