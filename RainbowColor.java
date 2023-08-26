import java.util.Scanner;

public class RainbowColor {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the color charcater  = ");
		char character = scan.next().charAt(0);
		RainbowColorApp z1 = new RainbowColorApp();
		z1.findColor(character);
		scan.close();
		
	}

}
