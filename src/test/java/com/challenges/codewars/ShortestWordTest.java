package com.challenges.codewars;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShortestWordTest {

	ShortestWord word = new ShortestWord();
	
	@Test
	public void testShortWord() {
		assertEquals(3, word.shortestWord("ETETETETET ETE ETETETE"));
	}
	@Test
	public void testShortWord_emptyString() {
		assertEquals(0, word.shortestWord(""));
	}
	

}
