package JavaProgramsStatic;

//Understanding of Static:
   
import org.testng.annotations.Test;

public class StaticClassTest3 extends StaticClassTest {


 @Test()
public static int testMethod1() {
		int a = 50;
		int b = 50;
		int c = a+b + wheel;
		System.out.println("Sum of Test Method1 - StaticClassTest3 - " + c);
		return c;
 	}
 
 @Test
public int testMethod2() {
	 	StaticClassTest.wheel = 10;
		//System.out.println(StaticClassTest.wheel);
	    wheel1=11;
		System.out.println("Value of Wheel1 - StaticClassTest3 - TestMethod2 - " + wheel1);
		return wheel1;
 	}
 
	
@Test()
public static void OverrideStaticTest() {
	   StaticClassTest sc = new StaticClassTest3();
	   sc.testMethod1();
	   System.out.println("Override Static Test - " + sc.testMethod1());
}

@Test()
public static void OverrideNonStaticTest() {
	   StaticClassTest sc = new StaticClassTest3();
	   sc.testMethod2();
	   
	   System.out.println("Override Non Static Test - " + sc.testMethod2());
 }










}

