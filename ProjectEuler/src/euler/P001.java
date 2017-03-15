/**
 * 
 */
package euler;

import java.util.Scanner;

/**
 * @date Mar 15, 2017
 */
/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6 and 9. The sum of these multiples is 23.Find the sum of all the
 * multiples of 3 or 5 below 1000.
 */
public class P001 implements Euler {
	public static void main(String args[]) {

		System.out.println("Sum : "+ new P001().run());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see euler.Euler#run()
	 */
	@Override
	public String run() {
		int n = 1000;

		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}

		return Integer.toString(sum);
	}

}
