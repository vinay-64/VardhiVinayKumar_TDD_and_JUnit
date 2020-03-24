package com.vinay.JUNIT_GDD_TASK;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RemoveAinFirst2CharsTest {
	RemoveA removeA;
	
	@BeforeEach
	void setUp() {
		removeA = new RemoveA();
	}
	
	@Test
	void testEmptyString() {
		assertEquals("",removeA.remove(""));
	}
	
	@Test
	void testSingleCharacterA() {
		assertEquals("C",removeA.remove("C"));
		assertEquals("",removeA.remove("A"));
	}
	
	@Test
	void testStringTwoCharactersA() {
		assertEquals("CB",removeA.remove("CB"));
		assertEquals("",removeA.remove("AA"));
		assertEquals("C",removeA.remove("AC"));
		assertEquals("C",removeA.remove("CA"));
	}
	
	@Test
	void testStringWithNCharacterA() {
		assertEquals("CBGFA",removeA.remove("ACBGFA"));
		assertEquals("BAC",removeA.remove("AABAC"));
		assertEquals("SDFVCA",removeA.remove("SDFVCA"));
		assertEquals("VBGHS",removeA.remove("VABGHS"));
	}

}
