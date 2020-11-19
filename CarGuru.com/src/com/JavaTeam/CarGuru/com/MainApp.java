/**
 * 
 */
package com.JavaTeam.CarGuru.com;
import java.util.*;


/**
 * @author anani
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Welcome to Car Guru. Tell us your first name: ");
		String name = sc.nextLine();
		
		
		System.out.println("Tell us the Make of the car you are looking for. OUr available Makes are: "
				+ "\"Volvo\", \"Kia\", \"Jaguar\", \"Dodge\", \"Chevrolet\" ");
		String make = sc.nextLine();
		
		
		System.out.println("Tell us the Model of the car you are looking for: ");
		String model = sc.nextLine();
		
		System.out.println("Enter the year of the car you are looking for: ");
		int year = sc.nextInt();
		
		
		System.out.println("Thank you for the information, " + name + ". Let's see if we can put you in a" + " "+ 
		year + " " + make + " "+ model + ".");
		
		
		// creating object Sedan
		 Sedan mySedan = new Sedan();
		 mySedan.carMessage();
		 
		 
		 // creating object SUV
		 Suv mySuv = new Suv();
		 mySuv.carMessage();
		 
		 
		 // creating object Truck
		 Truck myTruck = new Truck();
		 myTruck.carMessage();
		 
		
		
	}
	


	 
	 

}

