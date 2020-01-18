package Testng;

import org.testng.annotations.Test;

public class Dependency {
	
	@Test(groups = {"FirstGroup"})
	 public void testCase1(){
	 System.out.println("Test Case 1");
	 }
	 @Test(groups = {"SecondGroup"})
	 public void testCase2(){
	 System.out.println("Test Case 2");
	 }
	 
	 

}
