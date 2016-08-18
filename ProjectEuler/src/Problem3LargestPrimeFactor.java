import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * @author Muna Gurung
 *
 *<p>The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?</p>
 * <p> The prime factors of a positive Long are the prime numbers
 *  that divide that Long exactly.
 *  "Prime Factorization" is finding which prime numbers multiply 
 *  together to make the original number</p>
 *  <p> Prime number are numbers that can divide without remainder.
 *  A Prime Number can be divided evenly only by 1 or itself.
 *  And it must be a whole number greater than 1</p>
 */
public class Problem3LargestPrimeFactor {

	/**
	 * Default empty constructor
	 */
	public Problem3LargestPrimeFactor(){}
	
	/**
	 * Arraylist variables that holds the values of prime factors and prime numbers in a list
	 */
	private ArrayList<Long> primeFactors = new ArrayList<>();

	private ArrayList<Long> primeNumbers = new ArrayList<>();

	/**
	 * Main entry point for the program for demo/ debugging purposes
	 * @param args
	 */
	public static void main(String[] args) {
		Problem3LargestPrimeFactor a = new Problem3LargestPrimeFactor();
		a.findPrimeNumbers(1000000); // find the first 1 mil prime number
		a.findPrimeFactors(600851475143L); // use the prime number to list to find the prime facto of the given number
		
		// output the result to the console screen
		System.out.print("The highest prime factor number of 600851475143 is "
		+ (a.findHighestPrimeFactor(a.primeFactors)));
	}

	/**
	 * Method that finds prime number by a given limit. e.g. Find first 10 prime numbers.
	 * @param limit
	 * @return
	 */
	public ArrayList<Long> findPrimeNumbers(long limit)
	{
		// first 3 prime numbers already added in the prime number list
		// because they have exception rules when determining a prime number
		primeNumbers.add(2L);
		primeNumbers.add(3L);
		primeNumbers.add(5L);

		//multiples of 2 should be avoided as they are composite numbers

		//check if a number's digit is a multiple of 3, that number can be divided by 3

		// no prime numbers greater than 5 ends in a 5. Any number greater than 5 that ends in a 5 can be divided by 5

		// check for the above mentioned conditions in a for loop
		int i = 7;
		for (i = 7; i < limit; i++) {
			if(i%2 != 0 && i%3 != 0 && i%5 != 0)
				primeNumbers.add((long)i);
		}
		return primeNumbers;
	}

	/**
	 * Method that finds the prime factor of a given number, stores it in an array list and returns it
	 * @param number
	 * @return primeFactors
	 */
	public ArrayList<Long> findPrimeFactors(long number)
	{
		boolean chk = true;
		// variables: i is for prime number list loop counter and c is for quotient list loop counter
		long i = 0, c=0;
		
		/**
		 * variable that holds the list of quotient for a given number
		 */
		ArrayList<Long> quotientList = new ArrayList<>();
		
		// run loop until the prime factorization is complete
		while(chk)
		{
			// declare and instantiate the divisor and quotient variables
			long divisor = 0, quotient = 0;
			// divisor variable for initial/first member of quotient list
			long in = 0;

			// check if divisor is found, it is found if quotient divided by prime modulus is 0
			// until divisor is found, go through the list of prime numbers
			boolean chkd = true;

			// divisor is found by dividing the given number by a member of prime number where the modulus is 0
			in = number % primeNumbers.get((int) i);

			int a = 0; // prime loop should run until divisor is found
			// if quotient list already has a member
			if (quotientList.size() != 0)
			{
				// quotient variable retrieve from the quotient list
				// divisor needs to be found from the prime number list
				//long q = quotientList.get((int) c);
				quotient = quotientList.get((int) c);
				
				//loop to find the divisor
				while(chkd)
				{		
					// if modulus is 0, divisor is found
					if (quotient%primeNumbers.get((int)a)==0)
					{
						divisor = primeNumbers.get((int) a);
						chkd = false;
					}a++;
				}
				long check = quotient%divisor;
				if (check == 0)
				{
					quotient = quotientList.get((int) c) / divisor;
					quotientList.add(quotient);
					primeFactors.add(divisor);
					c++;
					if(quotient == 1)
						chk= false;
				}
			}
			else if (in == 0 && quotientList.size() == 0)
			{
				divisor = primeNumbers.get((int) i);
				quotient = number / divisor;
				quotientList.add(quotient);
				primeFactors.add(primeNumbers.get((int) i));
				if(quotient == 1)
					chk= false;
			}
			i++;
		}
		return primeFactors;
	}

	/**
	 * <p>Method that finds the highest prime factor in a given prime factor list.
	 * It does this by sorting the list and retrieving the last member of the list 
	 * because the last member is the highest number. </p> 
	 * @param list
	 * @return highestPrimeNumber
	 */
	public long findHighestPrimeFactor(ArrayList<Long> list)
	{
		Collections.sort(primeFactors);
		long highestPrimeNumber =primeFactors.get(primeFactors.size()-1);
		return highestPrimeNumber;
	}
}
