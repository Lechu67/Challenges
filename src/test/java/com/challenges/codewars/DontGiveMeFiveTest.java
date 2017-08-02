package com.challenges.codewars;

import static org.junit.Assert.*;

import org.junit.Test;

public class DontGiveMeFiveTest {

	DontGiveMeFive obj = new DontGiveMeFive();
	
	@Test
	public void testDontGiveMeFive() {
		assertEquals(11, obj.dontGiveMeFive(-6, 6));
	}

	@Test
	public void testDontGiveMeFiveBetter() {
		assertEquals(11, obj.dontGiveMeFiveBetter(-6, 6));
	}

}
