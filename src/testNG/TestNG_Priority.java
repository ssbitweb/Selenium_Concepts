package testNG;

import org.testng.annotations.Test;

// Q . How to set priority in TestNG Class?

// -- e.g @Test(priority = 0)
//        @Test(priority = 1)
//        @Test(priority = -1)  --> highest priority because negative value has higher priority than default.

// -- First Priority -- negative value of prioritize methods.
// -- second priority -- non prioritize methods in alphabetical order
// -- third priority -- prioritize methods , if priority is set same then by alphabetical order.
// -- if priority is set same -- then alphabetical order.
// -- if priority parameter is not set then it takes (default priority 0) to all test methods
//    and order of execution will be alphabetically. first methods will execute , 
// -- priority word is case sensitive.
// 

public class TestNG_Priority {

	@Test()
	public void c_method(){
		System.out.println("I'm in method C");
	}
	@Test()
	public void b_method(){
		System.out.println("I'm in method B");
	}
	@Test(priority = 6)
	public void a_method(){
		System.out.println("I'm in method A");
	}
	@Test(priority = 0)
	public void e_method(){
		System.out.println("I'm in method E");
	}
	@Test(priority = 6)
	public void d_method(){
		System.out.println("I'm in method D");
	}
	
	@Test(priority = -1)
	public void f_method(){
		System.out.println("I'm in method F");
	}
	
	@Test(priority = -2)
	public void g_method(){
		System.out.println("I'm in method G");
	}

}


/*

OUTPUT:
================

I'm in method G
I'm in method F
I'm in method B
I'm in method C
I'm in method E
I'm in method A
I'm in method D
PASSED: g_method
PASSED: f_method
PASSED: b_method
PASSED: c_method
PASSED: e_method
PASSED: a_method
PASSED: d_method


*/