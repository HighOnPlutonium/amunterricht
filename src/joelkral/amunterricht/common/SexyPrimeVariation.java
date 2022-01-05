package joelkral.amunterricht.common;

import java.util.stream.Stream;

/**
*Variation of {@code SexyPrime} using static methods and focusing on streams.
*@author Joel Kral
*/
public class SexyPrimeVariation
{
	public static int[] primes(int iterations) {
		return Stream.iterate(0, n -> n+1).limit(iterations).filter(n -> {for (int i=2; i<n; i++){if (n%i == 0){return false;}} return true;}).mapToInt(Integer::intValue).toArray();
	}
}