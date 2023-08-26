import java.util.Scanner;

public class PrimeOrNotApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number = ");
		int number = scan.nextInt();
		PrimeOrNot z1 = new PrimeOrNot();
		z1.display(number);
		scan.close();
	}

}
