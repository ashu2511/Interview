package com.ubs.opsit.interviews;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BerlinClockTC {

	@Test (expected = IllegalArgumentException.class)
	public void test_Not_Null() {
		BerlinClock.getTime(null);
	}

	@Test
	public void test_00_00_00() {
		assertEquals("Y\n" + "OOOOOOOOOOO\n" + "OOOO\n" + "OOOO\n" + "OOOO\n", BerlinClock.getTime("00:00:00"));
	}

	@Test
	public void test_13_20_07() {
		assertEquals("O\n" + "YYRYOOOOOOO\n" + "OOOO\n" + "RROO\n" + "RRRO\n", BerlinClock.getTime("13:20:07"));
	}

	@Test
	public void test_23_59_59() {
		assertEquals("O\n" + "YYRYYRYYRYY\n" + "YYYY\n" + "RRRR\n" + "RRRO\n", BerlinClock.getTime("23:59:59"));
	}

	@Test (expected = IllegalArgumentException.class)
	public void test_24_00_00() {
		BerlinClock.getTime("24:00:00");
	}
}
