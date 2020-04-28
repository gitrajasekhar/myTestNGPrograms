package JavaProgramsStatic;

import org.testng.annotations.Test;

public class StaticClassTest2  {
	 
@Test 
public static void testMethod1() {
	    System.out.println(StaticClassTest.wheel);
	}
@Test
public void testMethod10() {
		System.out.println("value of wheel1 - StaticClass Test2 - " + StaticClassTest.wheel);
		StaticClassTest sc = new StaticClassTest();
		System.out.println("value of wheel - StaticClass Test2 - " + sc.wheel1);
		sc.wheel1= 123;
		System.out.println("value of wheel - StaticClass Test2 - " + sc.wheel1);
   }
@Test	
public  static void testMethod11() { 
 		 System.out.println("Value of Wheel - TestMethod3  - StaticClass Test2 - " + StaticClassTest.wheel+1);
 	}
@Test	
public void testMethod12() {
	    StaticClassTest sc1 = new StaticClassTest();
	   	System.out.println("value of wheel - TestMethod4 - StaticClass Test2 - " + sc1.wheel1);
	    System.out.println("Value of Wheel - TestMethod4 - StaticClass Test2 - " + StaticClassTest.wheel+1);
	}
  












}
