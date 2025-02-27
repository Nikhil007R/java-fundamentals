import java.util.Scanner;

class  CelsiusToFahrenheit{

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Temperature in celsius: ");
		int celsius = sc.nextInt();
		int fahrenheit = (celsius * 9/5) + 32;
		
		System.out.println("Temperature in fahrenheit is " + fahrenheit);
	}
}
