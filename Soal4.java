/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intershipgits;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Aditya
 */
public class Soal4 {

	private static boolean checkDuplicate(int[] x) {
		Set<Integer> set = new HashSet<>();
		boolean result = false;
		for (int in : x) {
			if (!set.add(in)) {
				result = true;
			} else {
				set.add(in);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] x = {1,2,2,3,4,5};
		System.out.println(checkDuplicate(x));
	}
    
}
