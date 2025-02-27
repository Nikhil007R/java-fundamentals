import java.util.Scanner;

class AddTwoNumbers{

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int first = sc.nextInt();
		System.out.println("Enter second number");
		int second = sc.nextInt();
		int sum = first+second;
		
		System.out.println("Addition of " + first + " and " + second + " is " + sum);
	}
}
