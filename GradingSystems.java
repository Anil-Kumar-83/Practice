import java.util.Scanner;
public class GradingSystems {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your marks = ");
		int marks =scan.nextInt();
		GradingSystemsApp z1 = new GradingSystemsApp();
		z1.findTheGrade(marks);
		scan.close();
	}

}
