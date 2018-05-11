import java.util.Scanner;
public class Circlescanner {
	public static void main( String[] args) {
		System.out.println("Please input diameter");
		Scanner scanner =new Scanner(System.in);
		String d = scanner.nextLine();
		double r = Double.parseDouble(d)/2;
		double area = Math.PI*r*r;  
		System.out.printf("%.4f",area);
		scanner.close();
	}

}
