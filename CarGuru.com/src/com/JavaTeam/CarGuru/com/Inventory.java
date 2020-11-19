/**
 * 
 */
package com.JavaTeam.CarGuru.com;

import java.util.Scanner;

/**
 * @author anani
 *
 */
public class Inventory {

	// Declare Array Elements
	String [] make = { "Volvo", "Kia", "Jaguar", "Dodge", "Chevrolet"};
	
	String [] model = { "Volvo", "Kia", "Jaguar", "Dodge", "Chevrolet"};


// Ask for user to enter a number
	Scanner input = new Scanner(System.in);
	
	
	
// set try ... catch exception
	try{    
		System.out.println("Enter a number to display the corresponding first name: ");
		int num = input.nextInt();
        
		
		// Display matching name between index 0 and 9
        System.out.println("The corresponding first name is " + "" + firstName[num]);  
       }    
       
       catch(ArrayIndexOutOfBoundsException e)  
          {  
           System.out.println(e);
           
           
           // display message to user
           System.out.println("Invalid number position entered: Out of range. Please enter a number index between 0 and 9.");
          }
	}

}
	

