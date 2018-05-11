import java.util.Scanner;

public class Welcomescanner {
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input firstname and lastname:");
        String firstName,lastName;    
        firstName = scanner.next();
        lastName = scanner.next();
        
        System.out.println("Hello "+firstName+" "+lastName+".");
        System.out.println("Is that "+ firstName+" "+ lastName.toUpperCase() +" or " + firstName.toUpperCase()+" "+lastName+"?");
        scanner.close();
	}
}
