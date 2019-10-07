/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intershipgits;

/**
 *
 * @author Aditya
 */
public class Soal2 {
    	private static int missingNum(int[] a) {
		int lenght = a.length;
		int total = 1;

		for (int i = 2; i <= (lenght + 1); i++) {
			total += i;
			total -= a[i - 2];
		}

		return total;
	}

	public static void main(String[] args) {

		int[] x = {1,2,3,5,6,7};
		System.out.println(missingNum(x));
	}
}
