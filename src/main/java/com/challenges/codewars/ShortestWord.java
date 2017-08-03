package com.challenges.codewars;

import java.util.regex.Pattern;

/*
 * Simple, given a string of words, return the length of the shortest word(s).
	String will never be empty and you do not need to account for different data types.
 */
public class ShortestWord {

	public static void main (String[] args){
		
		String s = "";
		System.out.println(shortestWord(s));
	}

	public static int shortestWord(String s) {
		
		final String[] tokens = s.split(Pattern.quote(" "));
		int lengthS = 100;
		for(String temp : tokens){
			if(temp.length()<lengthS){
				lengthS = temp.length();
			}
		}
			
		return lengthS;
	}
}
