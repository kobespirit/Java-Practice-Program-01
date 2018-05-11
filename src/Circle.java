/*
 * COMP90041 lab1 
 * Assignment Name: Circle.java
 * Student NO.:653909 
 * Author: Changjian MA 
 * Date: 11/08/2015
 * Java program to print out the area of a circle whose
 * diameter is specified as the only command line argument
 */
public class Circle {
	public static void main( String[] args) {		
		String d;
		d = args[0];
		double r = Double.parseDouble(d)/2;
		double area = Math.PI*r*r;  		
		System.out.printf("%.4f",area);
		System.out.println();
	}
}
