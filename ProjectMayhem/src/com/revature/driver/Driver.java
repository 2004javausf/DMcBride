package com.revature.driver;

import com.revature.beans.Human;

public class Driver {

	// single comment
	/*
	 * Multi
	 * Line
	 * Comment
	 * Ha
	 * Ha
	 */
	/*
	 * Why Java?
	 * WORA principal
	 *       "Write once, Run anywhere"
	 * OOP
	 * Widespread use
	 * Great documentation!
	 * Oracle
	 * Sun Microsystems used to own it...
	 * version 1.8 "Java 8"
	 */
	
	public static void main(String[] args) {
		/*
		 * Method signature
		 * Access Modifiers
		 * 	public - everything can access it
		 *  static - do not need to instantiate to use/belongs to the class
		 *  void - doesn't return anything
		 *  String[] args - parameter (s) used for this method
		 *  
		 */
		System.out.println("Roll Tide");
		Human h= new Human();
		System.out.println(h);
		h.setName("Matt");
		h.setAge(34);
		h.setWeight(270);
		System.out.println(h.getName());
	}
}
