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
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Soal1 {

	private static String haveCommonSubString(String s1, String s2) {
		char[] subOne = s1.toCharArray();
		char[] subTwo = s2.toCharArray();
		Set<Character> builder = new HashSet<>();

		for (char c : subOne) {
			for (char value : subTwo) {
				if (c == value) {
					builder.add(c);
				}
			}
		}

		String s = builder.stream()
				.map(String::valueOf)
				.collect(Collectors.joining(" dan "));

		return s.isEmpty() ? "NO" : "YES " + s;
	}

	public static void main(String[] args) {
		String satu = "Helloj";
		String dua = "Worldj";

		System.out.println(haveCommonSubString(satu, dua));
	}
}

