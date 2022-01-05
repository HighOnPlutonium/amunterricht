package joelkral.amunterricht;

import java.util.Arrays;

import joelkral.amunterricht.common.SexyPrime;
import joelkral.amunterricht.common.SexyPrimeVariation;

public class Main 
{
	public static void main(String[] args) {
		SexyPrime sp = new SexyPrime(5); //SexyPrime(n)
		
		Util.print(sp.isSexy()); //sp.isSexy()
		
		Util.print(sp.getPair()); //sp.getPair()
		
		System.out.println(Arrays.toString(sp.iter(100))); //sp.iter(iterations)
		
		System.out.println(Arrays.deepToString(sp.iterPairs(11))); //sp.iterPairs(iterations)
		
		
		System.out.println(Arrays.toString(SexyPrimeVariation.primes(100))); //SexyPrimeVariation.iterPairs(iterations)
		
	}

}
