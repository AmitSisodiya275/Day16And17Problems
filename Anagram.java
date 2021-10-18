package com.bridgelab.algorithmprogram;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		Anagram anagram = new Anagram();
		anagram.checkAnagram("heart", "earth");
		anagram.checkAnagram("listen", "silent");
		anagram.checkAnagram("random", "wronginput");
	}
	
	public void checkAnagram(String inputOne, String inputTwo) {
		if(inputOne.length() == inputTwo.length()) {
			char [] first = new char [inputOne.length()], second = new char [inputTwo.length()];
			createCharArrayOfString(first,inputOne);
			createCharArrayOfString(second, inputTwo);
			Arrays.sort(first);
			Arrays.sort(second);
			if(Arrays.equals(first, second)) {
				System.out.println("Entered Strings \""+inputOne+"\" and \""+inputTwo+"\" are Anagram.");
			} else {
				System.out.println("Entered Strings \""+inputOne+"\" and \""+inputTwo+"\" are Not Anagram.");
			}
			
		}
		else {
			System.out.println("Entered Strings \""+inputOne+"\" and \""+inputTwo+"\" are Not Anagram.");
		}
	}

	public void createCharArrayOfString(char [] array, String input) {
		for (int i = 0; i< input.length(); i++) {
			array[i] = input.charAt(i);
		}
	}
}
