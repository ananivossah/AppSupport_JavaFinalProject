/**
 * 
 */
package com.JavaTeam.CarGuru.com;

/**
 * @author anani
 *
 */
public class Sedan implements Car {

	/**
	 */
	

	@Override
	public void carMessage() {
		
		System.out.println("A Sedan is ideal for one person or a couple");
	}
	
	
	public void alert() {
		System.out.println("Not readyu for a Truck or an SUV, we got you covered. Take a look at our Sedan inventory.");
		
	 }
}
