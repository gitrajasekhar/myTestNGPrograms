package TestNGIWScripts;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryClass implements IRetryAnalyzer{
	
	  int retrycount = 4;
	   int retry=1;
	   
public boolean retry(ITestResult result) {
	
   if(retry<retrycount) {
       retry++;
	   return true;
   }
       return false;
 }


}