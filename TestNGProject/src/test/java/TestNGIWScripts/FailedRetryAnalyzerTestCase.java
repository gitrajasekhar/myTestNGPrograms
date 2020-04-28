package TestNGIWScripts;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class FailedRetryAnalyzerTestCase {
	
	@Test(retryAnalyzer=RetryClass.class)
	public void RetryTestCase() {
		
		Assert.assertEquals("true","false");
	}	
	
} 
 