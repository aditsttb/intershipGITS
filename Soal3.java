/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intershipgits;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author Aditya
 */
public class Soal3 {
    	private static String minMaxSum(int[] a) {

		int total = 0;
		List<Integer> result = new ArrayList<>();

		for (int x : a) {
			total += x;
		}

		for (int value : a) {
			result.add(total - value);
		}

		int min = Collections.min(result);
		int max = Collections.max(result);

		return min + " " + max;
	}

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		System.out.println(minMaxSum(a));
	}
}
