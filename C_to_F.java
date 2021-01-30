import java.util.Scanner;

public class C_to_F {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Celsius");
		double Celsius = input.nextDouble();
		double Fahrenheit = (9.0/5)*Celsius+32;  // Finds out value in Fahrenheit
		System.out.println("Fahrenheit value is: " + Fahrenheit);
		input.close();
	}

}
