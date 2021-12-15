package amunterricht;

import java.util.Arrays;

public class Main 
{
	public static void main(String[] args) {
		SexyPrime sp = new SexyPrime(5); //SexyPrime(n)
		
		System.out.println(sp.isSexy()); //sp.isSexy()
		
		System.out.println(Arrays.toString(sp.getPair())); //sp.getPair()
		
		System.out.println(Arrays.toString(sp.iter(100))); //sp.iter(iterations)
		
		System.out.println(Arrays.deepToString(sp.iterPairs(11))); //sp.iterPairs(iterations)
	}

}
