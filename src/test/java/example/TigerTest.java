package test.java.example;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.example.Tiger;

public class TigerTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	  @Test
	  public void testEat() {
	    new Tiger().eat();
	  }

	  @Test
	  public void testSound() {
	    new Tiger().sound();
	  }

}
