package test.java.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.java.example.Dog;

public class DogTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetName() {
		  Dog dog = new Dog("doggy", 8.5, "boy", 3);
		  Assert.assertEquals("My name is doggy.", dog.getName());
	}
	
	@Test
	public void testHobby() {
		  Dog boy = new Dog("doggy", 8.5, "boy", 3);
		  Assert.assertEquals("Bite something.", boy.getItsHobby());
		  Dog girl = new Dog("doggy", 8.5, "girl", 3);
		  Assert.assertEquals("Play Ball.", girl.getItsHobby());
	}
	
	@Test
	public void testHowFastCanItRun() {
		Dog dog1 = new Dog("doggy", 8.5, "boy", -1);
		Assert.assertEquals("1", dog1.getHowFastCanItRun().toString());
		Dog dog2 = new Dog("doggy", 8.5, "boy", 11);
		Assert.assertEquals("1", dog2.getHowFastCanItRun().toString());
		
		Dog dog3 = new Dog("doggy", 6.0, "boy", 6);
		Assert.assertEquals("5", dog3.getHowFastCanItRun().toString());
		Dog dog4 = new Dog("doggy", 1.0, "boy", 6);
		Assert.assertEquals("3", dog4.getHowFastCanItRun().toString());
		Dog dog5 = new Dog("doggy", 11.0, "boy", 6); 
		Assert.assertEquals("3", dog5.getHowFastCanItRun().toString());
	}
}
