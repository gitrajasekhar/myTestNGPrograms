package TestNGIWScripts;

import org.testng.annotations.Test;

public class MethodsParallelExecution {

	@Test
	public void Method1() {
		//this method will print 1 to 50
		for(int i=0; i<50; i++) {
			System.out.println("Method1 Value is " + i);
		}
	}

	@Test
	public void Method2() {
		
		//this method will print 100 to 150
		for(int i=100; i<150; i++) 
			
			System.out.println("Method2 Value is " + i);
		}
	
		
	}






