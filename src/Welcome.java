/*
 * COMP90041 lab1 
 * Assignment Name: Welcome.java
 * Student NO.:653909 
 * Author: Changjian MA 
 * Date: 11/08/2015
 * Java program to print out two lines with person's firstname 
 * and lastname
 */
public class Welcome {
	public static void main(String[] args) {	       
		String firstName,lastName;    
        firstName = args[0];
        lastName = args[1];      
        System.out.println("Hello "+firstName+" "+lastName+".");
        System.out.println("Is that "+ firstName+" "+ lastName.toUpperCase() 
        +" or " + firstName.toUpperCase()+" "+lastName+"?");       
	}
}
