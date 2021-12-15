package amunterricht;

import java.util.ArrayList;

public class SexyPrime 
{
	private int n;
	
	/**
	*Constructur of {@code SexyPrime}.
	*@param n {@code int} on which we use our class
	*@return A new instance of {@code SexyPrime}
	*/
	public SexyPrime(int n) {
		this.n = n;
	}
	
	/**
	 * Tests if the {@code n} of this instance is a sexy prime.
	 * @return A boolean on if {@code n} is a sexy prime
	 */
	public boolean isSexy() {
		return Util.isPrime(n) && Util.isPrime(n+6);
	}
	
	/**
	 * Finds the the prime number {@code n} belongs to.
	 * If {@code n} isn't a sexy prime, returns {@code null}
	 * @return An array containing {@code n} and {@code n+6}.
	 */
	public int[] getPair() {
		if (this.isSexy()) {
			return new int[]{n,n+6};
			
		}
		return null;
	}
	
	/**
	 * Creates a list of all sexy primes for {@code iterations} iterations.
	 * @param iterations {@code int}, the amount of iterations 
	 * @return An array containing all sexy primes found after a certain amount of iterations
	 */
	public int[] iter(int iterations) {
		ArrayList<Integer> iter = new ArrayList<>();
		for (int i = 0; i < iterations; i++) {
			if (new SexyPrime(i).isSexy()) {
				iter.add(i);
			}
		}
		return iter.stream().mapToInt(Integer::intValue).toArray();
	}
	
	/**
	 * Creates a 2 dimensional list/list of lists containing all pairs of sexy primes for {@code iterations} iterations.
	 * @param iterations {@code int}, the amount of iterations
	 * @return An 2 dimensional array containing all sexy prime pairs found after a certain amount of iterations
	 */
	public int[][] iterPairs(int iterations){
		int r = 0;
		int[][] iter = new int[this.iter(iterations).length][2];
		for (int i: this.iter(iterations)) {
			iter[r][0] = i;
			iter[r][1] = i+6;
			r++;
		}
		return iter;
	}
    
	//Sexy primes are prime numbers whose sum with 6 is another prime number. A sexy prime pair is a pair of the sexy prime and its corresponding sum.
}
