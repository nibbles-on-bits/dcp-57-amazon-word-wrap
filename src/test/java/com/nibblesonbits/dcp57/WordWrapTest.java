package com.nibblesonbits.dcp57;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class WordWrapTest {
	
	@Test
	void wordWrapTest() {
		String testString = "the quick brown fox jumps over the lazy dog";
		int k = 10;
		String want = "the quick\nbrown fox\njumps over\nthe lazy\ndog";
		String got = WordWrap.wrapThis(testString, k);
		
		assertEquals(got, want);
	}

}
