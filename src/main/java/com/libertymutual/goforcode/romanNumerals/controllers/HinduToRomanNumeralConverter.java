package com.libertymutual.goforcode.romanNumerals.controllers;


import java.util.*;


public class HinduToRomanNumeralConverter {
	private Map<Integer, String> numbers;
		
	public HinduToRomanNumeralConverter() {
		numbers = new HashMap<Integer, String>();
		numbers.put(1, "I");
		numbers.put(2, "II");
		numbers.put(3, "III");
		numbers.put(4, "IV");
		numbers.put(5, "V");
		numbers.put(6, "VI");
		numbers.put(7, "VII");
		numbers.put(8, "VIII");
		numbers.put(9, "IX");
	}
	
	public String convert(int input) {
		String result = "";
		if (numbers.containsKey(input)) {
			result = numbers.get(input);
			return result;
		} else {
			return convertWithRecursion(input);
		}
	}
	
	public String convertWithRecursion(int input) {
		if (input == 0) {
			return "";
		} 
		if (input >= 1000) {
			return "M" + convertWithRecursion(input - 1000);
		} else if (input >= 900) {
			return "CM" + convertWithRecursion(input - 900);
		} else if (input >= 500) {
			return "D" + convertWithRecursion(input - 500);
		} else if (input >= 400) {  
			return "CD" + convertWithRecursion(input - 400);
		} else if (input >= 100) {
			return "C" + convertWithRecursion(input - 100);
		} else if (input >= 90) {
			return "XC" + convertWithRecursion(input - 90); 
		} else if (input >= 50) {
			return "L" + convertWithRecursion(input - 50);
		} else if (input >= 40) {
			return "XL" + convertWithRecursion(input - 40);
		} else if (input >= 10) {
			return "X" + convertWithRecursion(input - 10);
		} else if (input < 10) {
			return numbers.get(input) + convertWithRecursion(0);
		}
		return "";
	}
}
