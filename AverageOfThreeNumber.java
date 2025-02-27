import java.util.*;

class AverageOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
	System.out.println("Enter first Number: ");
        int first = sc.nextInt();
	
	System.out.println("Enter second Number: ");
	int second = sc.nextInt();

	System.out.println("ENter third Number");
	int third = sc.nextInt();

	double ans = (first + second + third) / 3;
	System.out.println("Average of three numbers is " + ans);
        
    }
}
