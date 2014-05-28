package edu.esprit.examtest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyclassTest {

	Myclass m;

	@Before
	public void setUp() throws Exception {

		m = new Myclass();
	}

	@Test
	public void itShouldReturnOneWhenTwoo() {

		assertEquals(1, m.process(2));

	}

}
