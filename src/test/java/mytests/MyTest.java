package mytests;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class MyTest {
	
	@Test//(retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void test1() 
	{
		Assert.assertEquals(false, true);
	}
	
	@Test//(retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void test2() 
	{
		Assert.assertEquals(false, true);
	}
	
	@Test//(retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void test3() 
	{
		Assert.assertEquals(true, true);
	}


}
