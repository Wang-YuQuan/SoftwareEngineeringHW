package test.java.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.java.example.Score;

public class ScoreTest {
	Score score = new Score();
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void EquivalencePartitioningTest() {
		Assert.assertEquals('X', score.letterGrade(-50));
		Assert.assertEquals('F', score.letterGrade(30));
		Assert.assertEquals('D', score.letterGrade(65));
		Assert.assertEquals('C', score.letterGrade(75));
		Assert.assertEquals('B', score.letterGrade(85));
		Assert.assertEquals('A', score.letterGrade(95));
		Assert.assertEquals('X', score.letterGrade(150));
	}
	
	@Test
	public void BoundaryValueAnalysisTest() {
		Assert.assertEquals('X', score.letterGrade(-1));
		Assert.assertEquals('F', score.letterGrade(0));
		Assert.assertEquals('F', score.letterGrade(59));
		Assert.assertEquals('D', score.letterGrade(60));
		Assert.assertEquals('D', score.letterGrade(69));
		Assert.assertEquals('C', score.letterGrade(70));
		Assert.assertEquals('C', score.letterGrade(79));
		Assert.assertEquals('B', score.letterGrade(80));
		Assert.assertEquals('B', score.letterGrade(89));
		Assert.assertEquals('A', score.letterGrade(90));
		Assert.assertEquals('A', score.letterGrade(100));
		Assert.assertEquals('X', score.letterGrade(101));
	}
	
	@Test
	public void CoverageTest() {
		
	}
}
