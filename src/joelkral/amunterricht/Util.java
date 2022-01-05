package joelkral.amunterricht;

import java.util.Arrays;

public class Util 
{
	public static boolean isPrime(int n) 
	{
		for (int i = 2; i<n; i++) {
			if (n%i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void print(int[] is) {
		System.out.println(is);
	}
	
	public static void print(Integer a) {
		System.out.println(a);
	}
	
	public static void print(String a) {
		System.out.println(a);
	}
	
	public static void print(Object[] a) {
		System.out.println(Arrays.deepToString(a));
	}
}
