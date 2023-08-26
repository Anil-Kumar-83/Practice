import java.util.Scanner;

public class Rainbow {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your character = ");
		char character =scan.next().charAt(0);
		RainbowApp z1 = new RainbowApp();
		z1.findColor(character);
		scan.close();
	}


}
