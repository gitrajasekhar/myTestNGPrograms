package TestNGIWScripts;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class TestNGLifeCycle {
	
  @BeforeSuite
  public void beforeSuite(){
	  System.out.println("this is before suite");
  }	
  @AfterSuite
  public void afterSuite(){
	  System.out.println("this is after suite");
  }	
  @BeforeClass
  public void beforeClass(){
	  System.out.println("this is before class");
  }	
 @AfterClass
  public void afterClass(){
	  System.out.println("this is after class");
  }	
 @BeforeTest
 public void beforeTest(){
	  System.out.println("this is before test");
 }	
 @AfterTest
 public void afterTest(){
	  System.out.println("this is after test");
 }	
 @BeforeMethod
 public void beforeTestMethod(){
	  System.out.println("this is before test method");
 }	
 @AfterMethod
 public void afterTestMethod(){
	  System.out.println("this is after test method");
 }	
 
  @Test(priority=2)
  public void method1() {
	  System.out.println("this is a method1");
  }

  @Test(priority=0)
  public void method2() {
	  
	  System.out.println("this is a method2");
  }
  
 
  
  
  
  
  
  
  
  
  
  
  
}
