package joelkral.amunterricht.common;

import java.util.stream.Stream;

import joelkral.amunterricht.Util;


/**
*Variation of {@code SexyPrime} using static methods and focusing on streams.
*@author Joel Kral
*/
public class SexyPrimeVariation
{
	public static int[] primes(int iterations) {
		return Stream.iterate(0, n -> n+1).limit(iterations).filter(Util::isPrime).mapToInt(Integer::intValue).toArray();
	}
}