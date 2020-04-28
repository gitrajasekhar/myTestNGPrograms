package JavaProgramsStatic;

//Understanding of Static:

	/*#1. Static Variable variable - once changed - it reflegftcdrdszsctes  in all classes
	#2. Static Methods cannt be Overridden
	#3. A static methods can call only static variables
	#4. A static Methods cant call non static variables
	#5. A NonStatic Methods can call both NonStatic aswellas Static Variables
	#6. Very imp - we can call the static variable as - Class.Variable - no need t
	 
	
	*/

import org.testng.annotations.Test;

public class StaticClassTest {
	
	static int wheel=4;
	int wheel1 = 10;

	@Test 
	public static int testMethod1() {
		
		int a = 10;
		int b = 20;
		int c = a+b + wheel;
		System.out.println("Sum of  StaticClassTest - Test Method1 - " + c);
		return c;
	}
	
	@Test
	public int testMethod2() {
		
		StaticClassTest.wheel = 5;
		//System.out.println(StaticClassTest.wheel);
	    wheel1=11;
		System.out.println("Value of Wheel1 - TestMethod2 - " + wheel1);
		return wheel1;
	}

	@Test public static void testMethod3() {
	System.out.println("Value of Wheel - TestMethod3 - " + wheel); }
	 
	@Test public void testMethod4() {
	 System.out.println("Value of Wheel1 - TestMethod4 - " + wheel1);
	  
	}
	 


}

